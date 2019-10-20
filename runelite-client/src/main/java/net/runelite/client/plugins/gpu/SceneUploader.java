/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.gpu;

import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Entity;
import net.runelite.api.Scene;
import net.runelite.api.TileModel;
import net.runelite.api.TilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;

@Singleton
class SceneUploader
{
	@Inject
	private Client client;

	int sceneId = (int) (System.currentTimeMillis() / 1000L);
	private int offset;
	private int uvoffset;

	void upload(Scene scene, GpuIntBuffer vertexbuffer, GpuFloatBuffer uvBuffer)
	{
		++sceneId;
		offset = 0;
		uvoffset = 0;
		vertexbuffer.clear();
		uvBuffer.clear();

		for (int z = 0; z < Constants.MAX_Z; ++z)
		{
			for (int x = 0; x < Constants.SCENE_SIZE; ++x)
			{
				for (int y = 0; y < Constants.SCENE_SIZE; ++y)
				{
					Tile tile = scene.getTiles()[z][x][y];
					if (tile != null)
					{
						reset(tile);
					}
				}
			}
		}

		for (int z = 0; z < Constants.MAX_Z; ++z)
		{
			for (int x = 0; x < Constants.SCENE_SIZE; ++x)
			{
				for (int y = 0; y < Constants.SCENE_SIZE; ++y)
				{
					Tile tile = scene.getTiles()[z][x][y];
					if (tile != null)
					{
						upload(tile, vertexbuffer, uvBuffer);
					}
				}
			}
		}
	}

	private void reset(Tile tile)
	{
		Tile bridge = tile.getBridge();
		if (bridge != null)
		{
			reset(bridge);
		}

		TilePaint TilePaint = tile.getTilePaint();
		if (TilePaint != null)
		{
			TilePaint.setBufferOffset(-1);
		}

		TileModel TileModel = tile.getTileModel();
		if (TileModel != null)
		{
			TileModel.setBufferOffset(-1);
		}

		WallObject wallObject = tile.getWallObject();
		if (wallObject != null)
		{
			if (wallObject.getEntity1() instanceof Model)
			{
				((Model) wallObject.getEntity1()).setBufferOffset(-1);
			}
			if (wallObject.getEntity2() instanceof Model)
			{
				((Model) wallObject.getEntity2()).setBufferOffset(-1);
			}
		}

		GroundObject groundObject = tile.getGroundObject();
		if (groundObject != null)
		{
			if (groundObject.getEntity() instanceof Model)
			{
				((Model) groundObject.getEntity()).setBufferOffset(-1);
			}
		}

		DecorativeObject decorativeObject = tile.getDecorativeObject();
		if (decorativeObject != null)
		{
			if (decorativeObject.getEntity1() instanceof Model)
			{
				((Model) decorativeObject.getEntity1()).setBufferOffset(-1);
			}
		}

		GameObject[] gameObjects = tile.getGameObjects();
		for (GameObject gameObject : gameObjects)
		{
			if (gameObject == null)
			{
				continue;
			}
			if (gameObject.getEntity() instanceof Model)
			{
				((Model) gameObject.getEntity()).setBufferOffset(-1);
			}
		}
	}

	private void upload(Tile tile, GpuIntBuffer vertexBuffer, GpuFloatBuffer uvBuffer)
	{
		Tile bridge = tile.getBridge();
		if (bridge != null)
		{
			upload(bridge, vertexBuffer, uvBuffer);
		}

		TilePaint TilePaint = tile.getTilePaint();
		if (TilePaint != null)
		{
			TilePaint.setBufferOffset(offset);
			if (TilePaint.getTexture() != -1)
			{
				TilePaint.setUvBufferOffset(uvoffset);
			}
			else
			{
				TilePaint.setUvBufferOffset(-1);
			}
			Point tilePoint = tile.getSceneLocation();
			int len = upload(TilePaint, tile.getRenderLevel(), tilePoint.getX(), tilePoint.getY(), vertexBuffer, uvBuffer);
			TilePaint.setBufferLen(len);
			offset += len;
			if (TilePaint.getTexture() != -1)
			{
				uvoffset += len;
			}
		}

		TileModel TileModel = tile.getTileModel();
		if (TileModel != null)
		{
			TileModel.setBufferOffset(offset);
			if (TileModel.getTriangleTextureId() != null)
			{
				TileModel.setUvBufferOffset(uvoffset);
			}
			else
			{
				TileModel.setUvBufferOffset(-1);
			}
			Point tilePoint = tile.getSceneLocation();
			int len = upload(TileModel, tilePoint.getX(), tilePoint.getY(), vertexBuffer, uvBuffer);
			TileModel.setBufferLen(len);
			offset += len;
			if (TileModel.getTriangleTextureId() != null)
			{
				uvoffset += len;
			}
		}

		WallObject wallObject = tile.getWallObject();
		if (wallObject != null)
		{
			Entity renderable1 = wallObject.getEntity1();
			if (renderable1 instanceof Model)
			{
				uploadModel((Model) renderable1, vertexBuffer, uvBuffer);
			}

			Entity renderable2 = wallObject.getEntity2();
			if (renderable2 instanceof Model)
			{
				uploadModel((Model) renderable2, vertexBuffer, uvBuffer);
			}
		}

		GroundObject groundObject = tile.getGroundObject();
		if (groundObject != null)
		{
			Entity renderable = groundObject.getEntity();
			if (renderable instanceof Model)
			{
				uploadModel((Model) renderable, vertexBuffer, uvBuffer);
			}
		}

		DecorativeObject decorativeObject = tile.getDecorativeObject();
		if (decorativeObject != null)
		{
			Entity renderable = decorativeObject.getEntity1();
			if (renderable instanceof Model)
			{
				uploadModel((Model) renderable, vertexBuffer, uvBuffer);
			}

			Entity renderable2 = decorativeObject.getEntity2();
			if (renderable2 instanceof Model)
			{
				uploadModel((Model) renderable2, vertexBuffer, uvBuffer);
			}
		}

		GameObject[] gameObjects = tile.getGameObjects();
		for (GameObject gameObject : gameObjects)
		{
			if (gameObject == null)
			{
				continue;
			}

			Entity renderable = gameObject.getEntity();
			if (renderable instanceof Model)
			{
				uploadModel((Model) gameObject.getEntity(), vertexBuffer, uvBuffer);
			}
		}
	}

	private int upload(TilePaint tile, int tileZ, int tileX, int tileY, GpuIntBuffer vertexBuffer, GpuFloatBuffer uvBuffer)
	{
		final int[][][] tileHeights = client.getTileHeights();

		final int localX = 0;
		final int localY = 0;

		int swHeight = tileHeights[tileZ][tileX][tileY];
		int seHeight = tileHeights[tileZ][tileX + 1][tileY];
		int neHeight = tileHeights[tileZ][tileX + 1][tileY + 1];
		int nwHeight = tileHeights[tileZ][tileX][tileY + 1];

		final int neColor = tile.getNeColor();
		final int nwColor = tile.getNwColor();
		final int seColor = tile.getSeColor();
		final int swColor = tile.getSwColor();

		if (neColor == 12345678)
		{
			return 0;
		}

		vertexBuffer.ensureCapacity(24);
		uvBuffer.ensureCapacity(24);

		// 0,0
		int vertexDx = localX;
		int vertexDy = localY;
		int vertexDz = swHeight;
		final int c1 = swColor;

		// 1,0
		int vertexCx = localX + Perspective.LOCAL_TILE_SIZE;
		int vertexCy = localY;
		int vertexCz = seHeight;
		final int c2 = seColor;

		// 1,1
		int vertexAx = localX + Perspective.LOCAL_TILE_SIZE;
		int vertexAy = localY + Perspective.LOCAL_TILE_SIZE;
		int vertexAz = neHeight;
		final int c3 = neColor;

		// 0,1
		int vertexBx = localX;
		int vertexBy = localY + Perspective.LOCAL_TILE_SIZE;
		int vertexBz = nwHeight;
		final int c4 = nwColor;

		vertexBuffer.put(vertexAx, vertexAz, vertexAy, c3);
		vertexBuffer.put(vertexBx, vertexBz, vertexBy, c4);
		vertexBuffer.put(vertexCx, vertexCz, vertexCy, c2);

		vertexBuffer.put(vertexDx, vertexDz, vertexDy, c1);
		vertexBuffer.put(vertexCx, vertexCz, vertexCy, c2);
		vertexBuffer.put(vertexBx, vertexBz, vertexBy, c4);

		if (tile.getTexture() != -1)
		{
			float tex = tile.getTexture() + 1f;
			uvBuffer.put(tex, 1.0f, 1.0f, 0f);
			uvBuffer.put(tex, 0.0f, 1.0f, 0f);
			uvBuffer.put(tex, 1.0f, 0.0f, 0f);

			uvBuffer.put(tex, 0.0f, 0.0f, 0f);
			uvBuffer.put(tex, 1.0f, 0.0f, 0f);
			uvBuffer.put(tex, 0.0f, 1.0f, 0f);
		}

		return 6;
	}

	private int upload(TileModel TileModel, int tileX, int tileY, GpuIntBuffer vertexBuffer, GpuFloatBuffer uvBuffer)
	{
		final int[] faceX = TileModel.getFaceX();
		final int[] faceY = TileModel.getFaceY();
		final int[] faceZ = TileModel.getFaceZ();

		final int[] vertexX = TileModel.getVertexX();
		final int[] vertexY = TileModel.getVertexY();
		final int[] vertexZ = TileModel.getVertexZ();

		final int[] triangleColorA = TileModel.getTriangleColorA();
		final int[] triangleColorB = TileModel.getTriangleColorB();
		final int[] triangleColorC = TileModel.getTriangleColorC();

		final int[] triangleTextures = TileModel.getTriangleTextureId();

		final int faceCount = faceX.length;

		vertexBuffer.ensureCapacity(faceCount * 12);
		uvBuffer.ensureCapacity(faceCount * 12);

		int baseX = Perspective.LOCAL_TILE_SIZE * tileX;
		int baseY = Perspective.LOCAL_TILE_SIZE * tileY;

		int cnt = 0;
		for (int i = 0; i < faceCount; ++i)
		{
			final int triangleA = faceX[i];
			final int triangleB = faceY[i];
			final int triangleC = faceZ[i];

			final int colorA = triangleColorA[i];
			final int colorB = triangleColorB[i];
			final int colorC = triangleColorC[i];

			if (colorA == 12345678)
			{
				continue;
			}

			cnt += 3;

			int vertexXA = vertexX[triangleA] - baseX;
			int vertexZA = vertexZ[triangleA] - baseY;

			int vertexXB = vertexX[triangleB] - baseX;
			int vertexZB = vertexZ[triangleB] - baseY;

			int vertexXC = vertexX[triangleC] - baseX;
			int vertexZC = vertexZ[triangleC] - baseY;

			vertexBuffer.put(vertexXA, vertexY[triangleA], vertexZA, colorA);
			vertexBuffer.put(vertexXB, vertexY[triangleB], vertexZB, colorB);
			vertexBuffer.put(vertexXC, vertexY[triangleC], vertexZC, colorC);

			if (triangleTextures != null)
			{
				if (triangleTextures[i] != -1)
				{
					float tex = triangleTextures[i] + 1f;
					uvBuffer.put(tex, vertexXA / 128f, vertexZA / 128f, 0f);
					uvBuffer.put(tex, vertexXB / 128f, vertexZB / 128f, 0f);
					uvBuffer.put(tex, vertexXC / 128f, vertexZC / 128f, 0f);
				}
				else
				{
					uvBuffer.put(0, 0, 0, 0f);
					uvBuffer.put(0, 0, 0, 0f);
					uvBuffer.put(0, 0, 0, 0f);
				}
			}
		}

		return cnt;
	}

	private void uploadModel(Model model, GpuIntBuffer vertexBuffer, GpuFloatBuffer uvBuffer)
	{
		if (model.getBufferOffset() > 0)
		{
			return;
		}

		model.setBufferOffset(offset);
		if (model.getFaceTextures() != null)
		{
			model.setUvBufferOffset(uvoffset);
		}
		else
		{
			model.setUvBufferOffset(-1);
		}
		model.setSceneId(sceneId);

		vertexBuffer.ensureCapacity(model.getTrianglesCount() * 12);
		uvBuffer.ensureCapacity(model.getTrianglesCount() * 12);

		final int triangleCount = model.getTrianglesCount();
		int len = 0;
		for (int i = 0; i < triangleCount; ++i)
		{
			len += pushFace(model, i, vertexBuffer, uvBuffer);
		}

		offset += len;
		if (model.getFaceTextures() != null)
		{
			uvoffset += len;
		}
	}

	int pushFace(Model model, int face, GpuIntBuffer vertexBuffer, GpuFloatBuffer uvBuffer)
	{
		final int[] vertexX = model.getVerticesX();
		final int[] vertexY = model.getVerticesY();
		final int[] vertexZ = model.getVerticesZ();

		final int[] trianglesX = model.getTrianglesX();
		final int[] trianglesY = model.getTrianglesY();
		final int[] trianglesZ = model.getTrianglesZ();

		final int[] color1s = model.getFaceColors1();
		final int[] color2s = model.getFaceColors2();
		final int[] color3s = model.getFaceColors3();

		final byte[] transparencies = model.getTriangleTransparencies();
		final short[] faceTextures = model.getFaceTextures();
		final byte[] facePriorities = model.getFaceRenderPriorities();

		int triangleA = trianglesX[face];
		int triangleB = trianglesY[face];
		int triangleC = trianglesZ[face];

		int color1 = color1s[face];
		int color2 = color2s[face];
		int color3 = color3s[face];

		int alpha = 0;
		if (transparencies != null && (faceTextures == null || faceTextures[face] == -1))
		{
			alpha = (transparencies[face] & 0xFF) << 24;
		}
		int priority = 0;
		if (facePriorities != null)
		{
			priority = (facePriorities[face] & 0xff) << 16;
		}

		if (color3 == -1)
		{
			color2 = color3 = color1;
		}
		else if (color3 == -2)
		{
			vertexBuffer.put(0, 0, 0, 0);
			vertexBuffer.put(0, 0, 0, 0);
			vertexBuffer.put(0, 0, 0, 0);

			if (faceTextures != null)
			{
				uvBuffer.put(0, 0, 0, 0f);
				uvBuffer.put(0, 0, 0, 0f);
				uvBuffer.put(0, 0, 0, 0f);
			}
			return 3;
		}

		int a, b, c;

		a = vertexX[triangleA];
		b = vertexY[triangleA];
		c = vertexZ[triangleA];

		vertexBuffer.put(a, b, c, alpha | priority | color1);

		a = vertexX[triangleB];
		b = vertexY[triangleB];
		c = vertexZ[triangleB];

		vertexBuffer.put(a, b, c, alpha | priority | color2);

		a = vertexX[triangleC];
		b = vertexY[triangleC];
		c = vertexZ[triangleC];

		vertexBuffer.put(a, b, c, alpha | priority | color3);

		float[][] u = model.getFaceTextureUCoordinates();
		float[][] v = model.getFaceTextureVCoordinates();
		float[] uf, vf;
		if (faceTextures != null)
		{
			if (u != null && v != null && (uf = u[face]) != null && (vf = v[face]) != null)
			{
				float texture = faceTextures[face] + 1f;
				uvBuffer.put(texture, uf[0], vf[0], 0f);
				uvBuffer.put(texture, uf[1], vf[1], 0f);
				uvBuffer.put(texture, uf[2], vf[2], 0f);
			}
			else
			{
				uvBuffer.put(0f, 0f, 0f, 0f);
				uvBuffer.put(0f, 0f, 0f, 0f);
				uvBuffer.put(0f, 0f, 0f, 0f);
			}
		}

		return 3;
	}
}
