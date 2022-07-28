import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class1 implements Callable {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	final Buffer field4;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lj;Lqw;Lu;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field4 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod12(this.field4); // L: 54
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-991776535"
	)
	static void method10(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1735615253"
	)
	public static File method9(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		File var22;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 48

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49 50 53
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 51
					if (var9 == -1) { // L: 52
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 55
				var9 = var8.readUnsignedByte(); // L: 56
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 57
				}

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var20) { // L: 70
				var20.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var22 = new File(var4); // L: 74
				if (!var22.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var22 = new File(var4, "test.dat"); // L: 80
				if (!ClanSettings.method3006(var22, true)) { // L: 81
					var4 = null; // L: 82
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 86
			label124:
			for (int var15 = 0; var15 < class14.cacheSubPaths.length; ++var15) { // L: 87
				for (int var16 = 0; var16 < class329.cacheParentPaths.length; ++var16) { // L: 88
					File var17 = new File(class329.cacheParentPaths[var16] + class14.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 89
					if (var17.exists() && ClanSettings.method3006(new File(var17, "test.dat"), true)) { // L: 90 91
						var4 = var17.toString(); // L: 92
						var6 = true; // L: 93
						break label124; // L: 94
					}
				}
			}
		}

		if (var4 == null) { // L: 100
			var4 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 101
			var6 = true; // L: 102
		}

		if (var5 != null) { // L: 104
			File var21 = new File(var5); // L: 105
			var22 = new File(var4); // L: 106

			try {
				File[] var23 = var21.listFiles(); // L: 108
				File[] var18 = var23; // L: 110

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 111
					File var12 = var18[var11]; // L: 112
					File var13 = new File(var22, var12.getName()); // L: 114
					boolean var14 = var12.renameTo(var13); // L: 115
					if (!var14) { // L: 116
						throw new IOException();
					}
				}
			} catch (Exception var19) { // L: 121
				var19.printStackTrace(); // L: 122
			}

			var6 = true; // L: 124
		}

		if (var6) { // L: 126
			class293.method5616(new File(var4), (File)null);
		}

		return new File(var4); // L: 127
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-53"
	)
	static int method7(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3846
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3752
			LoginPacket.method5207(); // L: 3753
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class260.clientPreferences.method2335() != 0 && !Client.playingJingle) { // L: 3755
			Archive var1 = MouseHandler.archive6; // L: 3756
			int var2 = class260.clientPreferences.method2335(); // L: 3757
			class273.musicPlayerStatus = 1; // L: 3759
			class149.musicTrackArchive = var1; // L: 3760
			class273.musicTrackGroupId = var0; // L: 3761
			UserComparator6.musicTrackFileId = 0; // L: 3762
			class273.musicTrackVolume = var2; // L: 3763
			class347.musicTrackBoolean = false; // L: 3764
			FaceNormal.pcmSampleLength = 2; // L: 3765
		}

		Client.currentTrackGroupId = var0; // L: 3768
	} // L: 3769

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-72"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7920
			if (Client.isLowDetail && var0 != FriendSystem.Client_plane) { // L: 7921
				return;
			}

			long var7 = 0L; // L: 7922
			boolean var9 = true; // L: 7923
			boolean var10 = false; // L: 7924
			boolean var11 = false; // L: 7925
			if (var1 == 0) { // L: 7926
				var7 = Decimator.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7927
				var7 = Decimator.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7928
				var7 = Decimator.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7929
				var7 = Decimator.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7930
				var12 = Decimator.scene.getObjectFlags(var0, var2, var3, var7); // L: 7931
				int var14 = class141.Entity_unpackID(var7); // L: 7932
				int var15 = var12 & 31; // L: 7933
				int var16 = var12 >> 6 & 3; // L: 7934
				ObjectComposition var13;
				if (var1 == 0) { // L: 7935
					Decimator.scene.removeWallObject(var0, var2, var3); // L: 7936
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7937
					if (var13.interactType != 0) { // L: 7938
						Client.collisionMaps[var0].method3857(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7940
					Decimator.scene.removeDecorativeObject(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7941
					Decimator.scene.removeGameObject(var0, var2, var3); // L: 7942
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7943
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7944
						return;
					}

					if (var13.interactType != 0) { // L: 7945
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7947
					Decimator.scene.removeGroundObject(var0, var2, var3); // L: 7948
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7949
					if (var13.interactType == 1) { // L: 7950
						Client.collisionMaps[var0].method3889(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7953
				var12 = var0; // L: 7954
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7955
					var12 = var0 + 1;
				}

				class341.method6300(var0, var12, var2, var3, var4, var5, var6, Decimator.scene, Client.collisionMaps[var0]); // L: 7956
			}
		}

	} // L: 7959
}
