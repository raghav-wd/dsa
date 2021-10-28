# Theory/Concepts
## Textures

Mipmapping - A texture gets divided into half every time, thus renderer uses different sizes of generated texture.

NearestFilter uses the texture directly thus avoiding mipmapping and generates a high resolution texture on the mesh.

Hence uses textures with power of 2 resolution like 512x512, 1024x1024, 512x2048 coz of mipmapping if the end result if not 1x1, threejs will resize it hence cpu power is consumed more.

## Materials

We can set sides to be rendered with material by `side` property of mesh.

MeshNormalMaterial - Normals are information that contains the direction outside of the face.

MeshMatcapMaterial - will display a color using normals as a reference to pick the right color for the texture that looks like a sphere, it creates illusion of sphere being lit and have shadows.

MeshLambertMaterial & MeshPhongMaterial - both reacts to light but meshlambert is more performant but it has no glossiness and has some wierd lines on the render, phong is better for visuals

MeshStandardMaterial - it follows PRB principle and its very close to real-life render.

NormalMap - adds detailing without adding vertices hence improve performance.

EnvironmentMap - uses 6 images that is px, nx, py, ny, pz and nz.
