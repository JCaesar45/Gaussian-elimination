# Γ(x) Gamma Function Explorer

An immersive, interactive mathematical visualization platform implementing the Lanczos approximation algorithm for computing the Gamma function across multiple programming languages.

## Features

- **Real-time Gamma Computation**: Interactive input with instant calculation results
- **Dynamic Visualization**: Canvas-based graphing with adjustable ranges (-5 to 10)
- **Multi-language Implementation**: JavaScript, Python, and Java source code display
- **Quantum Field Background**: Animated particle system with connection networks
- **Terminal Interface**: Simulated command-line output with typing effects
- **Responsive Design**: Adaptive layout for all screen sizes

## Mathematical Implementation

The Gamma function is computed using the Lanczos approximation with reflection formula:

```
Γ(z+1) ≈ √(2π) · (z + g + ½)^(z+½) · e^-(z+g+½) · A(z)

where A(z) is the series sum of coefficients p[i]/(z+i)
```

For x < 0.5, the reflection formula ensures accuracy:
```
Γ(x) = π / (sin(πx) · Γ(1-x))
```

## Algorithm Precision

- Coefficients sourced from GNU Scientific Library
- 15+ significant digits of precision
- Handles positive real numbers and fractional inputs
- Optimized for performance with memoization support

## Controls

| Control | Description |
|---------|-------------|
| X Value Input | Direct numerical entry (0.1 - 10) |
| Slider | Fine-tuned adjustment with 0.01 precision |
| Range Buttons | Preset graph views (0-5, 0-10, -5 to 5) |
| Animate | Automatic traversal of Gamma curve |
| Property Cards | Quick access to notable Gamma values |

## Notable Values

- Γ(0.5) = √π ≈ 1.7724538509055159
- Γ(1) = 0! = 1
- Γ(2) = 1! = 1  
- Γ(5) = 4! = 24

## Technical Stack

- **Frontend**: Vanilla JavaScript (ES6+), HTML5 Canvas, CSS3
- **Algorithms**: Lanczos approximation with reflection formula
- **Graphics**: Custom particle system, bezier curve rendering
- **UI**: CSS Grid, Flexbox, CSS animations, backdrop filters

## Browser Support

- Chrome 80+
- Firefox 75+
- Safari 13+
- Edge 80+

## Performance

- 60fps canvas animation
- O(1) Gamma computation per evaluation
- Efficient particle system (50 particles, connection culling)
- Hardware-accelerated CSS transforms

## License

Mathematical implementations based on public domain Lanczos coefficients. Interface design and visualization code proprietary.

---

Built with mathematical precision and creative code.
```
