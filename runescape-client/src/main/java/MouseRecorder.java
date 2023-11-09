import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cl")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("s")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("h")
	@Export("lock")
	Object lock;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -394441953
	)
	@Export("index")
	int index;
	@ObfuscatedName("v")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("c")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("q")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class144.method3006(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIS)V",
		garbageValue = "-17191"
	)
	public static void method2068(String var0, String var1, int var2, int var3) throws IOException {
		class439.idxCount = var3; // L: 40
		class340.cacheGamebuild = var2; // L: 41

		try {
			class146.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var28) { // L: 45
			class146.operatingSystemName = "Unknown"; // L: 46
		}

		InvDefinition.formattedOperatingSystemName = class146.operatingSystemName.toLowerCase(); // L: 48

		try {
			BufferedNetSocket.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (BufferedNetSocket.userHomeDirectory != null) { // L: 51
				BufferedNetSocket.userHomeDirectory = BufferedNetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var27) { // L: 53
		}

		try {
			if (InvDefinition.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (BufferedNetSocket.userHomeDirectory == null) { // L: 56
					BufferedNetSocket.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (BufferedNetSocket.userHomeDirectory == null) { // L: 59
				BufferedNetSocket.userHomeDirectory = System.getenv("HOME");
			}

			if (BufferedNetSocket.userHomeDirectory != null) { // L: 61
				BufferedNetSocket.userHomeDirectory = BufferedNetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var26) { // L: 63
		}

		if (BufferedNetSocket.userHomeDirectory == null) { // L: 64
			BufferedNetSocket.userHomeDirectory = "~/";
		}

		AbstractUserComparator.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", BufferedNetSocket.userHomeDirectory, "/tmp/", ""}; // L: 65
		class19.cacheSubPaths = new String[]{".jagex_cache_" + class340.cacheGamebuild, ".file_store_" + class340.cacheGamebuild}; // L: 66
		int var18 = 0;

		label235:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			NetFileRequest.JagexCache_locationFile = new File(BufferedNetSocket.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			File var33;
			if (NetFileRequest.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(NetFileRequest.JagexCache_locationFile, "rw", 10000L); // L: 78

					Buffer var11;
					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var30) { // L: 100
					var30.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var33 = new File(var7); // L: 104
					if (!var33.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var33 = new File(var7, "test.dat"); // L: 110
					if (!Renderable.method4227(var33, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label210:
				for (int var19 = 0; var19 < class19.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < AbstractUserComparator.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(AbstractUserComparator.cacheParentPaths[var20] + class19.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && Renderable.method4227(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label210; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = BufferedNetSocket.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			if (var8 != null) { // L: 134
				File var32 = new File(var8); // L: 135
				var33 = new File(var7); // L: 136

				try {
					File[] var35 = var32.listFiles(); // L: 138
					File[] var22 = var35; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var33, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var29) { // L: 151
					var29.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				Varcs.method2418(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 157
			class125.cacheDir = var5; // L: 159
			if (!class125.cacheDir.exists()) { // L: 160
				class125.cacheDir.mkdirs();
			}

			File[] var31 = class125.cacheDir.listFiles(); // L: 161
			if (var31 != null) { // L: 162
				File[] var34 = var31; // L: 164

				for (int var23 = 0; var23 < var34.length; ++var23) { // L: 165
					File var24 = var34[var23]; // L: 166
					if (!Renderable.method4227(var24, false)) { // L: 168
						++var18; // L: 67
						continue label235;
					}
				}
			}
			break;
		}

		File var4 = class125.cacheDir; // L: 175
		FileSystem.FileSystem_cacheDir = var4; // L: 177
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 178
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 179
			method2069(); // L: 181
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 182
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 183
			class115.JagexCache_idxFiles = new BufferedFile[class439.idxCount]; // L: 184

			for (int var25 = 0; var25 < class439.idxCount; ++var25) { // L: 185
				class115.JagexCache_idxFiles[var25] = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0); // L: 186
			}

		}
	} // L: 188

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1459298542"
	)
	static void method2069() {
		try {
			File var0 = new File(BufferedNetSocket.userHomeDirectory, "random.dat"); // L: 253
			int var2;
			if (var0.exists()) { // L: 254
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 255
			} else {
				label37:
				for (int var1 = 0; var1 < class19.cacheSubPaths.length; ++var1) { // L: 258
					for (var2 = 0; var2 < AbstractUserComparator.cacheParentPaths.length; ++var2) { // L: 259
						File var3 = new File(AbstractUserComparator.cacheParentPaths[var2] + class19.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 260
						if (var3.exists()) { // L: 261
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 262
							break label37; // L: 263
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 268
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 269
				var2 = var4.read(); // L: 270
				var4.seek(0L); // L: 271
				var4.write(var2); // L: 272
				var4.seek(0L); // L: 273
				var4.close(); // L: 274
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 275
			}
		} catch (IOException var5) { // L: 278
		}

	} // L: 279

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-366997688"
	)
	static int method2072(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1042
			var0 -= 1000; // L: 1043
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1044
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1046
		}

		String var4 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 1047
		int[] var5 = null; // L: 1048
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1049
			int var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1050
			if (var6 > 0) { // L: 1051
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]) { // L: 1052 1053
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1055
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1057

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1058
			if (var4.charAt(var7 - 1) == 's') { // L: 1059
				var8[var7] = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1060
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1062
		if (var7 != -1) { // L: 1063
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1064
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1065
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1066
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1067
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1068
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1069
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1070
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1071
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1072
			var3.onVarTransmit = var8; // L: 1073
			var3.varTransmitTriggers = var5; // L: 1074
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1076
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1077
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1078
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1079
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1080
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1081
			var3.onInvTransmit = var8; // L: 1082
			var3.invTransmitTriggers = var5; // L: 1083
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1085
			var3.onStatTransmit = var8; // L: 1086
			var3.statTransmitTriggers = var5; // L: 1087
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8; // L: 1089
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1090
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1091
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1092
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1093
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1094
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1095
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1096
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1097
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1098
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1099
			var3.field3441 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1100
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1101
			var3.field3476 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1102
			var3.field3369 = var8;
		} else if (var0 == 1430) {
			var3.field3472 = var8; // L: 1103
		} else if (var0 == 1431) { // L: 1104
			var3.field3493 = var8;
		} else {
			if (var0 != 1434) { // L: 1105
				return 2; // L: 1106
			}

			var3.field3364 = var8;
		}

		var3.hasListener = true; // L: 1107
		return 1; // L: 1108
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	static final void method2070() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7731 7732 7738
			if (var0.hitpoints == -1) { // L: 7733
				var0.delay = 0; // L: 7734
				WorldMap.method7319(var0); // L: 7735
			} else {
				var0.remove(); // L: 7737
			}
		}

	} // L: 7740

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1802202112"
	)
	static final void method2071(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10264
		int var7 = var3 - var1; // L: 10265
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10266
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10267
		int var10 = var8; // L: 10268
		if (var8 < var9) { // L: 10269
			var10 = var9;
		}

		if (var10 != 0) { // L: 10270
			int var11 = (var6 << 16) / var10; // L: 10271
			int var12 = (var7 << 16) / var10; // L: 10272
			if (var12 <= var11) { // L: 10273
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10274
			}

			int var13 = var5 * var12 >> 17; // L: 10275
			int var14 = var5 * var12 + 1 >> 17; // L: 10276
			int var15 = var5 * var11 >> 17; // L: 10277
			int var16 = var5 * var11 + 1 >> 17; // L: 10278
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10279
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10280
			int var17 = var0 + var13; // L: 10281
			int var18 = var0 - var14; // L: 10282
			int var19 = var0 + var6 - var14; // L: 10283
			int var20 = var0 + var6 + var13; // L: 10284
			int var21 = var15 + var1; // L: 10285
			int var22 = var1 - var16; // L: 10286
			int var23 = var7 + var1 - var16; // L: 10287
			int var24 = var15 + var7 + var1; // L: 10288
			Rasterizer3D.method4002(var17, var18, var19); // L: 10289
			Rasterizer3D.method3952(var21, var22, var23, var17, var18, var19, var4); // L: 10290
			Rasterizer3D.method4002(var17, var19, var20); // L: 10291
			Rasterizer3D.method3952(var21, var23, var24, var17, var19, var20, var4); // L: 10292
		}
	} // L: 10293
}
