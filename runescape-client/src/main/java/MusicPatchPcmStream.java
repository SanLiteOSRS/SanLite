import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -838217357
	)
	static int field2544;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lhn;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lak;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		signature = "(Lhn;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lhj;[IIIIS)V",
		garbageValue = "-24010"
	)
	void method4127(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2516[var1.field2554] & 4) != 0 && var1.field2561 < 0) {
			int var6 = this.superStream.field2490[var1.field2554] / (PcmPlayer.field394 * 22050);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2567) / var6;
				if (var7 > var4) {
					var1.field2567 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2567 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field394 * 22050 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2503[var1.field2554] == 0) {
					var1.stream = RawPcmStream.method898(var1.rawSound, var10.method981(), var10.method904(), var10.method905());
				} else {
					var1.stream = RawPcmStream.method898(var1.rawSound, var10.method981(), 0, var10.method905());
					this.superStream.method3933(var1, var1.patch.field2533[var1.field2547] < 0);
					var1.stream.method909(var8, var10.method904());
				}

				if (var1.patch.field2533[var1.field2547] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method920(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method941()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lhj;IB)V",
		garbageValue = "0"
	)
	void method4128(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2516[var1.field2554] & 4) != 0 && var1.field2561 < 0) {
			int var3 = this.superStream.field2490[var1.field2554] / (PcmPlayer.field394 * 22050);
			int var4 = (var3 + 1048575 - var1.field2567) / var3;
			var1.field2567 = var3 * var2 + var1.field2567 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2503[var1.field2554] == 0) {
					var1.stream = RawPcmStream.method898(var1.rawSound, var1.stream.method981(), var1.stream.method904(), var1.stream.method905());
				} else {
					var1.stream = RawPcmStream.method898(var1.rawSound, var1.stream.method981(), 0, var1.stream.method905());
					this.superStream.method3933(var1, var1.patch.field2533[var1.field2547] < 0);
				}

				if (var1.patch.field2533[var1.field2547] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2567 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("g")
	protected int vmethod4124() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3964(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2566) {
						this.method4127(var6, var1, var4, var5, var5 + var4);
						var6.field2566 -= var5;
						break;
					}

					this.method4127(var6, var1, var4, var6.field2566, var5 + var4);
					var4 += var6.field2566;
					var5 -= var6.field2566;
				} while(!this.superStream.method3965(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("l")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3964(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2566) {
						this.method4128(var3, var2);
						var3.field2566 -= var2;
						break;
					}

					this.method4128(var3, var3.field2566);
					var2 -= var3.field2566;
				} while(!this.superStream.method3965(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Z",
		garbageValue = "918211470"
	)
	static boolean method4150(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "551121602"
	)
	public static void method4123() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1879723646"
	)
	static final void method4122() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = Varcs.localPlayer.x;
			var1 = Varcs.localPlayer.y;
			if (class6.oculusOrbFocalPointX - var0 < -500 || class6.oculusOrbFocalPointX - var0 > 500 || Players.oculusOrbFocalPointY - var1 < -500 || Players.oculusOrbFocalPointY - var1 > 500) {
				class6.oculusOrbFocalPointX = var0;
				Players.oculusOrbFocalPointY = var1;
			}

			if (var0 != class6.oculusOrbFocalPointX) {
				class6.oculusOrbFocalPointX += (var0 - class6.oculusOrbFocalPointX) / 16;
			}

			if (var1 != Players.oculusOrbFocalPointY) {
				Players.oculusOrbFocalPointY += (var1 - Players.oculusOrbFocalPointY) / 16;
			}

			var2 = class6.oculusOrbFocalPointX >> 7;
			var3 = Players.oculusOrbFocalPointY >> 7;
			var4 = UserComparator7.getTileHeight(class6.oculusOrbFocalPointX, Players.oculusOrbFocalPointY, class26.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = class26.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field735) {
				Client.field735 += (var6 - Client.field735) / 24;
			} else if (var6 < Client.field735) {
				Client.field735 += (var6 - Client.field735) / 80;
			}

			VarbitComposition.field3544 = UserComparator7.getTileHeight(Varcs.localPlayer.x, Varcs.localPlayer.y, class26.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			method4149();
			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field702 = var10;
				Client.field681 = var11;
			}

			if (Client.field679 < var2) {
				Client.field679 += var2 / 8;
				if (Client.field679 > var2) {
					Client.field679 = var2;
				}
			} else if (Client.field679 > var2) {
				Client.field679 = Client.field679 * 9 / 10;
			}

			if (Client.field679 > 0) {
				var3 = Client.field679 / 16;
				if (Client.field702 >= 0) {
					var0 = Client.field702 - class69.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					class6.oculusOrbFocalPointX += var4 * var3 / 65536;
					Players.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field681 != 0) {
					VarbitComposition.field3544 += var3 * Client.field681;
					if (VarbitComposition.field3544 > 0) {
						VarbitComposition.field3544 = 0;
					}
				}
			} else {
				Client.field702 = -1;
				Client.field681 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				Client.packetWriter.addNode(ObjectComposition.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && MouseHandler.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		signature = "(Lgl;I)V",
		garbageValue = "-1679293239"
	)
	static final void method4148(class203 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class203.field2328 == var0) {
			var2 = var1.method6623();
			var3 = var1.readUnsignedShort();
			var4 = var1.method6609();
			var5 = (var4 >> 4 & 7) + class18.field145;
			var6 = (var4 & 7) + FriendsChatManager.field3818;
			var7 = var1.method6623();
			var8 = var7 >> 4 & 15;
			var9 = var7 & 7;
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				var10 = var8 + 1;
				if (Varcs.localPlayer.pathX[0] >= var5 - var10 && Varcs.localPlayer.pathX[0] <= var5 + var10 && Varcs.localPlayer.pathY[0] >= var6 - var10 && Varcs.localPlayer.pathY[0] <= var10 + var6 && Login.clientPreferences.areaSoundEffectsVolume != 0 && var9 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var3;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16);
					++Client.soundEffectCount;
				}
			}
		}

		if (class203.field2335 == var0) {
			var2 = var1.method6623();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field663[var3];
			var6 = var1.method6609();
			var7 = (var6 >> 4 & 7) + class18.field145;
			var8 = (var6 & 7) + FriendsChatManager.field3818;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				class16.updatePendingSpawn(class26.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
			}

		} else {
			int var40;
			if (class203.field2329 == var0) {
				var2 = var1.method6617();
				var3 = var1.readUnsignedByte();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field663[var4];
				var7 = var1.method6609();
				var8 = (var7 >> 4 & 7) + class18.field145;
				var9 = (var7 & 7) + FriendsChatManager.field3818;
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
					if (var6 == 0) {
						BoundaryObject var31 = WorldMapArea.scene.method3457(class26.Client_plane, var8, var9);
						if (var31 != null) {
							var40 = WorldMapSection1.Entity_unpackID(var31.tag);
							if (var4 == 2) {
								var31.entity1 = new DynamicObject(var40, 2, var5 + 4, class26.Client_plane, var8, var9, var2, false, var31.entity1);
								var31.entity2 = new DynamicObject(var40, 2, var5 + 1 & 3, class26.Client_plane, var8, var9, var2, false, var31.entity2);
							} else {
								var31.entity1 = new DynamicObject(var40, var4, var5, class26.Client_plane, var8, var9, var2, false, var31.entity1);
							}
						}
					}

					if (var6 == 1) {
						WallDecoration var43 = WorldMapArea.scene.method3458(class26.Client_plane, var8, var9);
						if (var43 != null) {
							var40 = WorldMapSection1.Entity_unpackID(var43.tag);
							if (var4 != 4 && var4 != 5) {
								if (var4 == 6) {
									var43.entity1 = new DynamicObject(var40, 4, var5 + 4, class26.Client_plane, var8, var9, var2, false, var43.entity1);
								} else if (var4 == 7) {
									var43.entity1 = new DynamicObject(var40, 4, (var5 + 2 & 3) + 4, class26.Client_plane, var8, var9, var2, false, var43.entity1);
								} else if (var4 == 8) {
									var43.entity1 = new DynamicObject(var40, 4, var5 + 4, class26.Client_plane, var8, var9, var2, false, var43.entity1);
									var43.entity2 = new DynamicObject(var40, 4, (var5 + 2 & 3) + 4, class26.Client_plane, var8, var9, var2, false, var43.entity2);
								}
							} else {
								var43.entity1 = new DynamicObject(var40, 4, var5, class26.Client_plane, var8, var9, var2, false, var43.entity1);
							}
						}
					}

					if (var6 == 2) {
						GameObject var44 = WorldMapArea.scene.method3459(class26.Client_plane, var8, var9);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var44 != null) {
							var44.entity = new DynamicObject(WorldMapSection1.Entity_unpackID(var44.tag), var4, var5, class26.Client_plane, var8, var9, var2, false, var44.entity);
						}
					}

					if (var6 == 3) {
						FloorDecoration var45 = WorldMapArea.scene.getFloorDecoration(class26.Client_plane, var8, var9);
						if (var45 != null) {
							var45.renderable = new DynamicObject(WorldMapSection1.Entity_unpackID(var45.tag), 22, var5, class26.Client_plane, var8, var9, var2, false, var45.renderable);
						}
					}
				}

			} else {
				int var13;
				int var14;
				if (class203.field2332 == var0) {
					var2 = var1.method6617();
					var3 = var1.readUnsignedShort();
					byte var37 = var1.method6678();
					var5 = var1.method6617();
					var6 = var1.readUnsignedByte();
					var7 = var1.readUnsignedByte();
					var8 = var1.readUnsignedByte() * 4;
					var9 = var1.method6621();
					var10 = var1.method6609();
					var40 = (var10 >> 4 & 7) + class18.field145;
					int var41 = (var10 & 7) + FriendsChatManager.field3818;
					byte var42 = var1.method6612();
					var14 = var1.method6610() * 4;
					var4 = var37 + var40;
					var13 = var42 + var41;
					if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var4 >= 0 && var13 >= 0 && var4 < 104 && var13 < 104 && var5 != 65535) {
						var40 = var40 * 128 + 64;
						var41 = var41 * 128 + 64;
						var4 = var4 * 128 + 64;
						var13 = var13 * 128 + 64;
						Projectile var15 = new Projectile(var5, class26.Client_plane, var40, var41, UserComparator7.getTileHeight(var40, var41, class26.Client_plane) - var14, var3 + Client.cycle, var2 + Client.cycle, var6, var7, var9, var8);
						var15.setDestination(var4, var13, UserComparator7.getTileHeight(var4, var13, class26.Client_plane) - var8, var3 + Client.cycle);
						Client.projectiles.addFirst(var15);
					}

				} else {
					TileItem var33;
					if (class203.field2331 == var0) {
						var2 = var1.method6610();
						var3 = (var2 >> 4 & 7) + class18.field145;
						var4 = (var2 & 7) + FriendsChatManager.field3818;
						var5 = var1.readUnsignedShort();
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
							NodeDeque var32 = Client.groundItems[class26.Client_plane][var3][var4];
							if (var32 != null) {
								for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) {
									if ((var5 & 32767) == var33.id) {
										var33.remove();
										break;
									}
								}

								if (var32.last() == null) {
									Client.groundItems[class26.Client_plane][var3][var4] = null;
								}

								class225.updateItemPile(var3, var4);
							}
						}

					} else if (class203.field2339 == var0) {
						var2 = var1.readUnsignedByte();
						var3 = var1.method6748();
						var4 = var1.readUnsignedShort();
						var5 = var1.method6623();
						var6 = (var5 >> 4 & 7) + class18.field145;
						var7 = (var5 & 7) + FriendsChatManager.field3818;
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var6 = var6 * 128 + 64;
							var7 = var7 * 128 + 64;
							GraphicsObject var46 = new GraphicsObject(var3, class26.Client_plane, var6, var7, UserComparator7.getTileHeight(var6, var7, class26.Client_plane) - var2, var4, Client.cycle);
							Client.graphicsObjects.addFirst(var46);
						}

					} else if (class203.field2333 == var0) {
						var2 = var1.readUnsignedShort();
						var3 = var1.readUnsignedShort();
						var4 = var1.method6617();
						var5 = var1.readUnsignedByte();
						var6 = (var5 >> 4 & 7) + class18.field145;
						var7 = (var5 & 7) + FriendsChatManager.field3818;
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							NodeDeque var34 = Client.groundItems[class26.Client_plane][var6][var7];
							if (var34 != null) {
								for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
									if ((var2 & 32767) == var35.id && var4 == var35.quantity) {
										var35.quantity = var3;
										break;
									}
								}

								class225.updateItemPile(var6, var7);
							}
						}

					} else if (class203.field2334 == var0) {
						var2 = var1.readUnsignedShort();
						var3 = var1.method6610();
						var4 = (var3 >> 4 & 7) + class18.field145;
						var5 = (var3 & 7) + FriendsChatManager.field3818;
						var6 = var1.readUnsignedShort();
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
							var33 = new TileItem();
							var33.id = var6;
							var33.quantity = var2;
							if (Client.groundItems[class26.Client_plane][var4][var5] == null) {
								Client.groundItems[class26.Client_plane][var4][var5] = new NodeDeque();
							}

							Client.groundItems[class26.Client_plane][var4][var5].addFirst(var33);
							class225.updateItemPile(var4, var5);
						}

					} else {
						if (class203.field2327 == var0) {
							var2 = var1.method6610();
							var3 = var2 >> 2;
							var4 = var2 & 3;
							var5 = Client.field663[var3];
							var6 = var1.readUnsignedShort();
							var7 = var1.method6766();
							byte var38 = var1.readByte();
							var9 = var1.method6748();
							byte var39 = var1.method6612();
							byte var11 = var1.method6678();
							byte var12 = var1.method6678();
							var13 = var1.readUnsignedByte();
							var14 = (var13 >> 4 & 7) + class18.field145;
							int var36 = (var13 & 7) + FriendsChatManager.field3818;
							int var16 = var1.readUnsignedShort();
							Player var17;
							if (var7 == Client.localPlayerIndex) {
								var17 = Varcs.localPlayer;
							} else {
								var17 = Client.players[var7];
							}

							if (var17 != null) {
								ObjectComposition var18 = class19.getObjectDefinition(var16);
								int var19;
								int var20;
								if (var4 != 1 && var4 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}

								int var21 = var14 + (var19 >> 1);
								int var22 = var14 + (var19 + 1 >> 1);
								int var23 = var36 + (var20 >> 1);
								int var24 = var36 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[class26.Client_plane];
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2;
								int var27 = (var14 << 7) + (var19 << 6);
								int var28 = (var36 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28);
								if (var29 != null) {
									class16.updatePendingSpawn(class26.Client_plane, var14, var36, var5, -1, 0, 0, var6 + 1, var9 + 1);
									var17.animationCycleStart = var6 + Client.cycle;
									var17.animationCycleEnd = var9 + Client.cycle;
									var17.model0 = var29;
									var17.field1175 = var14 * 128 + var19 * 64;
									var17.field1177 = var36 * 128 + var20 * 64;
									var17.tileHeight2 = var26;
									byte var30;
									if (var38 > var39) {
										var30 = var38;
										var38 = var39;
										var39 = var30;
									}

									if (var12 > var11) {
										var30 = var12;
										var12 = var11;
										var11 = var30;
									}

									var17.field1187 = var38 + var14;
									var17.field1180 = var14 + var39;
									var17.field1179 = var12 + var36;
									var17.field1176 = var36 + var11;
								}
							}
						}

						if (class203.field2330 == var0) {
							var2 = var1.method6609();
							var3 = var2 >> 2;
							var4 = var2 & 3;
							var5 = Client.field663[var3];
							var6 = var1.method6766();
							var7 = var1.readUnsignedByte();
							var8 = (var7 >> 4 & 7) + class18.field145;
							var9 = (var7 & 7) + FriendsChatManager.field3818;
							if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
								class16.updatePendingSpawn(class26.Client_plane, var8, var9, var5, var6, var3, var4, 0, -1);
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1958659772"
	)
	static final void method4126(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Login.clientPreferences.areaSoundEffectsVolume = var0;
		Message.savePreferences();
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-2"
	)
	static void method4149() {
		if (Client.field685 && Varcs.localPlayer != null) {
			int var0 = Varcs.localPlayer.pathX[0];
			int var1 = Varcs.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			class6.oculusOrbFocalPointX = Varcs.localPlayer.x;
			int var2 = UserComparator7.getTileHeight(Varcs.localPlayer.x, Varcs.localPlayer.y, class26.Client_plane) - Client.camFollowHeight;
			if (var2 < VarbitComposition.field3544) {
				VarbitComposition.field3544 = var2;
			}

			Players.oculusOrbFocalPointY = Varcs.localPlayer.y;
			Client.field685 = false;
		}

	}
}
