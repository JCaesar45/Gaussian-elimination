/**
 * Gamma function implementation using Lanczos approximation
 * Highly accurate for positive real numbers
 */
function gamma(x) {
    // Lanczos coefficients (GSL - GNU Scientific Library)
    const g = 7;
    const p = [
        0.99999999999980993,
        676.5203681218851,
        -1259.1392167224028,
        771.32342877765313,
        -176.61502916214059,
        12.507343278686905,
        -0.13857109526572012,
        9.9843695780195716e-6,
        1.5056327351493116e-7
    ];
    
    // Reflection formula for x < 0.5
    if (x < 0.5) {
        return Math.PI / (Math.sin(Math.PI * x) * gamma(1 - x));
    }
    
    x -= 1;
    let a = p[0];
    for (let i = 1; i < p.length; i++) {
        a += p[i] / (x + i);
    }
    
    const t = x + g + 0.5;
    return Math.sqrt(2 * Math.PI) * Math.pow(t, x + 0.5) * Math.exp(-t) * a;
}

// Test cases
console.log(gamma(0.1));  // 9.513507698668736
console.log(gamma(0.2));  // 4.590843711998803
console.log(gamma(0.3));  // 2.9915689876875904
console.log(gamma(0.4));  // 2.218159543757687
console.log(gamma(0.5));  // 1.7724538509055159
