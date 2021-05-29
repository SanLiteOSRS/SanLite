import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 8797083750332969957L
	)
	long field3768;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 807741776312371019L
	)
	long field3766;
	@ObfuscatedName("f")
	public boolean field3769;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -8039422533561910721L
	)
	long field3770;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -1942511866147941553L
	)
	long field3767;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6788679505704133641L
	)
	long field3771;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2093027907
	)
	int field3772;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2015708795
	)
	int field3773;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -211935081
	)
	int field3774;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1004054843
	)
	int field3775;

	public Timer() {
		this.field3768 = -1L;
		this.field3766 = -1L;
		this.field3769 = false;
		this.field3770 = 0L;
		this.field3767 = 0L;
		this.field3771 = 0L;
		this.field3772 = 0;
		this.field3773 = 0;
		this.field3774 = 0;
		this.field3775 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1898013614"
	)
	public void method5602() {
		this.field3768 = ObjectComposition.currentTimeMillis();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public void method5590() {
		if (this.field3768 != -1L) {
			this.field3767 = ObjectComposition.currentTimeMillis() - this.field3768;
			this.field3768 = -1L;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1638200135"
	)
	public void method5591(int var1) {
		this.field3766 = ObjectComposition.currentTimeMillis();
		this.field3772 = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-99"
	)
	public void method5592() {
		if (-1L != this.field3766) {
			this.field3770 = ObjectComposition.currentTimeMillis() - this.field3766;
			this.field3766 = -1L;
		}

		++this.field3774;
		this.field3769 = true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-722241109"
	)
	public void method5593() {
		this.field3769 = false;
		this.field3773 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107700042"
	)
	public void method5594() {
		this.method5592();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-442398587"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3767;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3770;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3771;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3772);
		var1.writeShort(this.field3773);
		var1.writeShort(this.field3774);
		var1.writeShort(this.field3775);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1457822410"
	)
	public static boolean method5614(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class301.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2049201204"
	)
	static int method5595(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1991704132"
	)
	static int method5600(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++class44.Interpreter_intStackSize;
			return 1;
		}
	}
}
