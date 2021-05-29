import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 1846107143
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("v")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1145652403"
	)
	public static File method393(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		class390.JagexCache_locationFile = new File(class22.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		File var23;
		if (class390.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(class390.JagexCache_locationFile, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var21) {
				var21.printStackTrace();
			}

			if (var4 != null) {
				var23 = new File(var4);
				if (!var23.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var23 = new File(var4, "test.dat");
				if (!FaceNormal.isWriteable(var23, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label141:
			for (int var15 = 0; var15 < PlayerType.cacheSubPaths.length; ++var15) {
				for (int var16 = 0; var16 < InterfaceParent.cacheParentPaths.length; ++var16) {
					File var17 = new File(InterfaceParent.cacheParentPaths[var16] + PlayerType.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && FaceNormal.isWriteable(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label141;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = class22.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var22;
		if (var5 != null) {
			var22 = new File(var5);
			var23 = new File(var4);

			try {
				File[] var24 = var22.listFiles();
				File[] var18 = var24;

				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var23, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var20) {
				var20.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var22 = new File(var4);
			var8 = null;

			try {
				AccessFile var25 = new AccessFile(class390.JagexCache_locationFile, "rw", 10000L);
				Buffer var26 = new Buffer(500);
				var26.writeByte(3);
				var26.writeByte(var8 != null ? 1 : 0);
				var26.writeCESU8(var22.getPath());
				if (var8 != null) {
					var26.writeCESU8("");
				}

				var25.write(var26.array, 0, var26.offset);
				var25.close();
			} catch (IOException var19) {
				var19.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjv;IIIZI)V",
		garbageValue = "1003938789"
	)
	@Export("playMusicTrack")
	public static void playMusicTrack(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class232.musicPlayerStatus = 1;
		ModelData0.musicTrackArchive = var1;
		class32.musicTrackGroupId = var2;
		class18.musicTrackFileId = var3;
		class232.musicTrackVolume = var4;
		class232.musicTrackBoolean = var5;
		class232.pcmSampleLength = var0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1869214638"
	)
	public static boolean method394(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-786826616"
	)
	static final void method391(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeOfferOwnWorldComparator.field632 || UserComparator4.field1427 != var1) {
			GrandExchangeOfferOwnWorldComparator.field632 = var0;
			UserComparator4.field1427 = var1;
			class12.updateGameState(25);
			DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", true);
			int var3 = VertexNormal.baseX * 64;
			int var4 = SoundSystem.baseY * 64;
			VertexNormal.baseX = (var0 - 6) * 8;
			SoundSystem.baseY = (var1 - 6) * 8;
			int var5 = VertexNormal.baseX * 64 - var3;
			int var6 = SoundSystem.baseY * 64 - var4;
			var3 = VertexNormal.baseX * 64;
			var4 = SoundSystem.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var14 != var11; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			MouseHandler.cameraX -= var5 << 7;
			class105.cameraZ -= var6 << 7;
			RouteStrategy.oculusOrbFocalPointX -= var5 << 7;
			ModelData0.oculusOrbFocalPointY -= var6 << 7;
			Client.field872 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Lio;II)V",
		garbageValue = "1454811445"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !HitSplatDefinition.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && HitSplatDefinition.isComponentHidden(var3) && var3 != World.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (Clock.loadInterface(var5)) {
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = InvDefinition.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = LoginScreenAnimation.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field913; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; WorldMapCacheName.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3014 != 0 && !var3.isIf3) {
						int var8 = var3.field3014 >> 16;
						var5 = var3.field3014 << 16 >> 16;
						var8 *= Client.field913;
						var5 *= Client.field913;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						WorldMapCacheName.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
