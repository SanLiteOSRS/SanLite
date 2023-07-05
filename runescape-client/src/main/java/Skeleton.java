import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -322801287
	)
	@Export("id")
	int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2025739055
	)
	@Export("count")
	int count;
	@ObfuscatedName("ak")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ae")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	class226 field2543;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2543 = new class226(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method4509() {
		return this.count; // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lid;",
		garbageValue = "208942676"
	)
	public class226 method4507() {
		return this.field2543; // L: 42
	}

	@ObfuscatedName("an")
	static final void method4505(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1572302747"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4780
		if (Projectile.localPlayer.x >> 7 == Client.destinationX && Projectile.localPlayer.y >> 7 == Client.destinationY) { // L: 4782
			Client.destinationX = 0; // L: 4783
		}

		if (Client.field751) { // L: 4787
			HealthBarUpdate.addPlayerToScene(Projectile.localPlayer, false); // L: 4788
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4792
			HealthBarUpdate.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4793
		}

		class481.addNpcsToScene(true); // L: 4796
		class336.method6569(); // L: 4797
		class481.addNpcsToScene(false); // L: 4798

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4800 4801 4818
			if (var4.plane == Clock.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4802
				if (Client.cycle >= var4.cycleStart) { // L: 4803
					if (var4.targetIndex > 0) { // L: 4804
						NPC var23 = Client.npcs[var4.targetIndex - 1]; // L: 4805
						if (var23 != null && var23.x >= 0 && var23.x < 13312 && var23.y >= 0 && var23.y < 13312) { // L: 4806
							var4.setDestination(var23.x, var23.y, Renderable.getTileHeight(var23.x, var23.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4808
						var6 = -var4.targetIndex - 1; // L: 4810
						Player var26;
						if (var6 == Client.localPlayerIndex) { // L: 4811
							var26 = Projectile.localPlayer;
						} else {
							var26 = Client.players[var6]; // L: 4812
						}

						if (var26 != null && var26.x >= 0 && var26.x < 13312 && var26.y >= 0 && var26.y < 13312) { // L: 4813
							var4.setDestination(var26.x, var26.y, Renderable.getTileHeight(var26.x, var26.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field733); // L: 4815
					class36.scene.drawEntity(Clock.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4816
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var24 = (GraphicsObject)Client.graphicsObjects.last(); var24 != null; var24 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4822 4823 4830
			if (var24.plane == Clock.Client_plane && !var24.isFinished) { // L: 4824
				if (Client.cycle >= var24.cycleStart) { // L: 4825
					var24.advance(Client.field733); // L: 4826
					if (var24.isFinished) { // L: 4827
						var24.remove();
					} else {
						class36.scene.drawEntity(var24.plane, var24.x, var24.y, var24.z, 60, var24, 0, -1L, false); // L: 4828
					}
				}
			} else {
				var24.remove();
			}
		}

		WorldMapDecorationType.setViewportShape(var0, var1, var2, var3, true); // L: 4833
		var0 = Client.viewportOffsetX; // L: 4834
		var1 = Client.viewportOffsetY; // L: 4835
		var2 = Client.viewportWidth; // L: 4836
		var3 = Client.viewportHeight; // L: 4837
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4838
		Rasterizer3D.method4382(); // L: 4839
		Rasterizer2D.method9269(); // L: 4840
		int var21 = Client.camAngleX; // L: 4841
		if (Client.field605 / 256 > var21) { // L: 4842
			var21 = Client.field605 / 256;
		}

		if (Client.field771[4] && Client.field695[4] + 128 > var21) { // L: 4843
			var21 = Client.field695[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4844
		var6 = ModeWhere.oculusOrbFocalPointX; // L: 4845
		int var7 = Login.field917; // L: 4846
		int var8 = GrandExchangeEvents.oculusOrbFocalPointY; // L: 4847
		int var9 = class101.method2635(var21); // L: 4848
		int var11 = var3 - 334; // L: 4852
		if (var11 < 0) { // L: 4853
			var11 = 0;
		} else if (var11 > 100) { // L: 4854
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight; // L: 4855
		int var10 = var12 * var9 / 256; // L: 4856
		var11 = 2048 - var21 & 2047; // L: 4859
		var12 = 2048 - var5 & 2047; // L: 4860
		int var13 = 0; // L: 4861
		int var14 = 0; // L: 4862
		int var15 = var10; // L: 4863
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4864
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4865
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4866
			var18 = var14 * var17 - var16 * var10 >> 16; // L: 4867
			var15 = var16 * var14 + var10 * var17 >> 16; // L: 4868
			var14 = var18; // L: 4869
		}

		if (var12 != 0) { // L: 4871
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4872
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4873
			var18 = var13 * var17 + var15 * var16 >> 16; // L: 4874
			var15 = var17 * var15 - var16 * var13 >> 16; // L: 4875
			var13 = var18; // L: 4876
		}

		if (Client.isCameraLocked) { // L: 4878
			UserComparator8.field1415 = var6 - var13; // L: 4879
			DecorativeObject.field2828 = var7 - var14; // L: 4880
			Clock.field1883 = var8 - var15; // L: 4881
			Clock.field1884 = var21; // L: 4882
			class53.field368 = var5; // L: 4883
		} else {
			class208.cameraX = var6 - var13; // L: 4886
			class152.cameraY = var7 - var14; // L: 4887
			ByteArrayPool.cameraZ = var8 - var15; // L: 4888
			MusicPatchNode.cameraPitch = var21; // L: 4889
			class291.cameraYaw = var5; // L: 4890
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ModeWhere.oculusOrbFocalPointX >> 7 != Projectile.localPlayer.x >> 7 || GrandExchangeEvents.oculusOrbFocalPointY >> 7 != Projectile.localPlayer.y >> 7)) { // L: 4892 4893
			var16 = Projectile.localPlayer.plane; // L: 4894
			var17 = class213.baseX * 64 + (ModeWhere.oculusOrbFocalPointX >> 7); // L: 4895
			var18 = class101.baseY * 64 + (GrandExchangeEvents.oculusOrbFocalPointY >> 7); // L: 4896
			PacketBufferNode var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 4899
			var19.packetBuffer.method9000(var18); // L: 4900
			var19.packetBuffer.writeByte(var16); // L: 4901
			var19.packetBuffer.method8949(var17); // L: 4902
			var19.packetBuffer.method8961(Client.field601); // L: 4903
			Client.packetWriter.addNode(var19); // L: 4904
		}

		if (!Client.isCameraLocked) { // L: 4910
			var10 = class17.method269();
		} else {
			if (class10.clientPreferences.method2434()) { // L: 4914
				var11 = Clock.Client_plane; // L: 4915
			} else {
				var12 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane); // L: 4918
				if (var12 - class152.cameraY < 800 && (Tiles.Tiles_renderFlags[Clock.Client_plane][class208.cameraX >> 7][ByteArrayPool.cameraZ >> 7] & 4) != 0) { // L: 4919
					var11 = Clock.Client_plane; // L: 4920
				} else {
					var11 = 3; // L: 4923
				}
			}

			var10 = var11; // L: 4925
		}

		var11 = class208.cameraX; // L: 4927
		var12 = class152.cameraY; // L: 4928
		var13 = ByteArrayPool.cameraZ; // L: 4929
		var14 = MusicPatchNode.cameraPitch; // L: 4930
		var15 = class291.cameraYaw; // L: 4931

		for (var16 = 0; var16 < 5; ++var16) { // L: 4932
			if (Client.field771[var16]) { // L: 4933
				var17 = (int)(Math.random() * (double)(Client.field772[var16] * 2 + 1) - (double)Client.field772[var16] + Math.sin((double)Client.field763[var16] * ((double)Client.field774[var16] / 100.0D)) * (double)Client.field695[var16]); // L: 4934
				if (var16 == 0) { // L: 4935
					class208.cameraX += var17;
				}

				if (var16 == 1) { // L: 4936
					class152.cameraY += var17;
				}

				if (var16 == 2) { // L: 4937
					ByteArrayPool.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4938
					class291.cameraYaw = var17 + class291.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4939
					MusicPatchNode.cameraPitch += var17; // L: 4940
					if (MusicPatchNode.cameraPitch < 128) { // L: 4941
						MusicPatchNode.cameraPitch = 128;
					}

					if (MusicPatchNode.cameraPitch > 383) { // L: 4942
						MusicPatchNode.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4946
		var17 = MouseHandler.MouseHandler_y; // L: 4947
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4948
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4949
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4950
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4952
			var18 = var16 - var0; // L: 4953
			int var22 = var17 - var1; // L: 4954
			ViewportMouse.ViewportMouse_x = var18; // L: 4956
			ViewportMouse.ViewportMouse_y = var22; // L: 4957
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4958
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4959
			ViewportMouse.ViewportMouse_false0 = false; // L: 4960
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4965
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4966
		}

		WorldMapSectionType.playPcmPlayers(); // L: 4969
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4970
		WorldMapSectionType.playPcmPlayers(); // L: 4971
		var18 = Rasterizer3D.method4374(); // L: 4972
		Rasterizer3D.method4416(class347.client.field209); // L: 4973
		Rasterizer3D.field2520.field2796 = Client.viewportZoom; // L: 4974
		class36.scene.draw(class208.cameraX, class152.cameraY, ByteArrayPool.cameraZ, MusicPatchNode.cameraPitch, class291.cameraYaw, var10); // L: 4975
		Rasterizer3D.method4416(false); // L: 4976
		if (Client.renderSelf) { // L: 4977
			Rasterizer2D.method9270(); // L: 4978
		}

		Rasterizer3D.field2520.field2796 = var18; // L: 4980
		WorldMapSectionType.playPcmPlayers(); // L: 4981
		class36.scene.clearTempGameObjects(); // L: 4982
		class152.method3199(var0, var1, var2, var3); // L: 4983
		if (Client.hintArrowType == 2) { // L: 4985
			Decimator.worldToScreen(Client.field530 * 64 + (Client.field527 - class213.baseX * 64 << 7), Client.field531 * 64 + (Client.field697 - class101.baseY * 64 << 7), Client.field529 * 4); // L: 4986
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4987
				ReflectionCheck.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2520.Rasterizer3D_textureLoader).animate(Client.field733); // L: 4989
		ScriptEvent.method2256(var0, var1, var2, var3); // L: 4990
		class208.cameraX = var11; // L: 4991
		class152.cameraY = var12; // L: 4992
		ByteArrayPool.cameraZ = var13; // L: 4993
		MusicPatchNode.cameraPitch = var14; // L: 4994
		class291.cameraYaw = var15; // L: 4995
		if (Client.field516) { // L: 4996
			byte var20 = 0; // L: 4999
			int var25 = var20 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 5000
			if (var25 == 0) { // L: 5004
				Client.field516 = false;
			}
		}

		if (Client.field516) { // L: 5006
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5007
			class230.drawLoadingMessage("Loading - please wait.", false); // L: 5008
		}

	} // L: 5010
}
