import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1816711147
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("bh")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1767289693"
	)
	public static File method4244(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		SecureRandomCallable.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var11;
		File var27;
		if (SecureRandomCallable.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(SecureRandomCallable.JagexCache_locationFile, "rw", 10000L);

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
			} catch (IOException var25) {
				var25.printStackTrace();
			}

			if (var4 != null) {
				var27 = new File(var4);
				if (!var27.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var27 = new File(var4, "test.dat");

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw");
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11);
					var15.seek(0L);
					var15.close();
					var27.delete();
					var28 = true;
				} catch (Exception var23) {
					var28 = false;
				}

				if (!var28) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label153:
			for (int var16 = 0; var16 < JagexCache.cacheSubPaths.length; ++var16) {
				for (int var17 = 0; var17 < ArchiveLoader.cacheParentPaths.length; ++var17) {
					File var18 = new File(ArchiveLoader.cacheParentPaths[var17] + JagexCache.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists()) {
						File var19 = new File(var18, "test.dat");

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var19.delete();
							var29 = true;
						} catch (Exception var22) {
							var29 = false;
						}

						if (var29) {
							var4 = var18.toString();
							var6 = true;
							break label153;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var26;
		if (var5 != null) {
			var26 = new File(var5);
			var27 = new File(var4);

			try {
				File[] var33 = var26.listFiles();
				File[] var31 = var33;

				for (var11 = 0; var11 < var31.length; ++var11) {
					File var30 = var31[var11];
					File var20 = new File(var27, var30.getName());
					boolean var14 = var30.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var24) {
				var24.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var26 = new File(var4);
			var8 = null;

			try {
				AccessFile var34 = new AccessFile(SecureRandomCallable.JagexCache_locationFile, "rw", 10000L);
				Buffer var32 = new Buffer(500);
				var32.writeByte(3);
				var32.writeByte(var8 != null ? 1 : 0);
				var32.writeCESU8(var26.getPath());
				if (var8 != null) {
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset);
				var34.close();
			} catch (IOException var21) {
				var21.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-768574216"
	)
	public static String method4251(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class125.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-2101430297"
	)
	static int method4250(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3082 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == 1428) {
			var3.field3075 = var8;
		} else if (var0 == 1429) {
			var3.field3076 = var8;
		} else if (var0 == 1430) {
			var3.field3071 = var8;
		} else {
			if (var0 != 1431) {
				return 2;
			}

			var3.field3000 = var8;
		}

		var3.hasListener = true;
		return 1;
	}
}
