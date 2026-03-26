import math

def gamma(x):
    """
    Gamma function implementation using Lanczos approximation
    Highly accurate for positive real numbers
    """
    # Lanczos coefficients (GSL - GNU Scientific Library)
    g = 7
    p = [
        0.99999999999980993,
        676.5203681218851,
        -1259.1392167224028,
        771.32342877765313,
        -176.61502916214059,
        12.507343278686905,
        -0.13857109526572012,
        9.9843695780195716e-6,
        1.5056327351493116e-7
    ]
    
    # Reflection formula for x < 0.5
    if x < 0.5:
        return math.pi / (math.sin(math.pi * x) * gamma(1 - x))
    
    x -= 1
    a = p[0]
    for i in range(1, len(p)):
        a += p[i] / (x + i)
    
    t = x + g + 0.5
    return math.sqrt(2 * math.pi) * (t ** (x + 0.5)) * math.exp(-t) * a

# Test cases
print(gamma(0.1))  # 9.513507698668736
print(gamma(0.2))  # 4.590843711998803
print(gamma(0.3))  # 2.9915689876875904
print(gamma(0.4))  # 2.218159543757687
print(gamma(0.5))  # 1.7724538509055159
