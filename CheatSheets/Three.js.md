# Theory/Concepts
## Textures

Mipmapping - A texture gets divided into half every time, thus renderer uses different sizes of generated texture.

NearestFilter uses the texture directly thus avoiding mipmapping and generates a high resolution texture on the mesh.

Hence uses textures with power of 2 resolution like 512x512, 1024x1024, 512x2048 coz of mipmapping if the end result if not 1x1, threejs will resize it hence cpu power is consumed more.
