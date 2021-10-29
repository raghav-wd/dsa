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

Displacement Map - Adds details by adding height to the detailings.

Roughness Map - Adds shines

EnvironmentMap - uses 6 images that is px, nx, py, ny, pz and nz.

## Shaders
Attributes - Different property for all the vertices.
Uniforms - Same property for all the vertices.

Fragment is like pixel but for shaders.

It requires a lot of data.

There are two types of shaders, vertex and fragment.

Why use? Are simple and performant, we can wave a plane and add custom-post processing.

## Notes

- Avoid initializing same multiple material and texture.
- Lights has high performance cost.
- Ambient light simulates light bounce.

## Terminology

Frustum Culling - Creates either box or sphere around an object to help three.js calculate if object is on screen

Penumbra - is a space of partial illumination (as in an eclipse) between the perfect shadow on all sides and the full light. Bluriness at the edges.

Core Shadow - dark shadow at the back of the object.

Baked Shadow - textures of shadow made of 3D softwares. Static shadows are best to be baked, but dynamic shadows can abso be achieved with refactoring on the shadow.

Primitive - Shapes that are provided by three.js

Z-fighting - also called stitching or planefighting, is a phenomenon in 3D rendering that occurs when two or more primitives have very similar distances to the camera.

Drop Shadow - shadow silhoutte of object at the floor.

Adaptive Blending - drawing pixels on top of other pixel making pixels brighters.
