import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("q")
public class class18 extends class14 {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1954969381
	)
	int field144;
	@ObfuscatedName("e")
	boolean field145;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field144 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field144 = var1.readUnsignedShort();
		this.field145 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method133(this.field144, this.field145);
	}

	@ObfuscatedName("f")
	public static final void method272(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-118293038"
	)
	static void method275(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance);
		var0.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field268 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	public static boolean method271(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1866300199"
	)
	static int method262(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			EnumComposition var10 = TextureProvider.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				EnumComposition var4 = TextureProvider.getEnum(var3);
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
			EnumComposition var7 = TextureProvider.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIIIII)V",
		garbageValue = "1257309508"
	)
	static final void method273(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field689) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field689 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				Script.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				Script.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				Script.invalidateWidget(var0);
				Client.field689 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				Script.invalidateWidget(var0);
			}
		}

	}
}
