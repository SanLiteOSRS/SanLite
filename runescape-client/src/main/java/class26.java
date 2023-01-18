import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class26 implements KeyListener, FocusListener {
	@ObfuscatedName("e")
	Collection field144;
	@ObfuscatedName("v")
	Collection field145;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	class30[] field143;
	@ObfuscatedName("m")
	boolean[] field146;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1016027891
	)
	volatile int field148;

	class26() {
		this.field143 = new class30[3]; // L: 16
		this.field146 = new boolean[112]; // L: 17
		this.field148 = 0; // L: 18
		this.field144 = new ArrayList(100); // L: 21
		this.field145 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;II)V",
		garbageValue = "1136972282"
	)
	void method353(class30 var1, int var2) {
		this.field143[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1025402851"
	)
	int method354() {
		return this.field148; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1611687696"
	)
	void method355(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-972177183"
	)
	synchronized void method352(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field144.add(new class34(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "38"
	)
	void method361() {
		++this.field148; // L: 48
		this.method358(); // L: 49
		Iterator var1 = this.field145.iterator(); // L: 50

		while (var1.hasNext()) {
			class34 var2 = (class34)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field143.length && !var2.method487(this.field143[var3]); ++var3) { // L: 53 54
			}
		}

		this.field145.clear();
	} // L: 61

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-999573246"
	)
	synchronized void method358() {
		Collection var1 = this.field145;
		this.field145 = this.field144;
		this.field144 = var1; // L: 150
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					var2 = class140.method3105(var2); // L: 73
					boolean var5 = (var2 & 128) != 0; // L: 76
					if (var5) { // L: 78
						var2 = -1;
					}
					break label24;
				}
			}

			var2 = -1; // L: 82
		}

		if (var2 >= 0) { // L: 84
			this.field146[var2] = true; // L: 85
			this.field144.add(new class34(1, var2)); // L: 86
			this.field148 = 0; // L: 87
		}

		var1.consume(); // L: 89
	} // L: 90

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 93
			if (var2 >= 0) { // L: 95
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 99
				if (var2 < var4) { // L: 101
					var2 = class140.method3105(var2) & -129; // L: 102
					break label17;
				}
			}

			var2 = -1; // L: 106
		}

		if (var2 >= 0) { // L: 108
			this.field146[var2] = false; // L: 109
			this.field144.add(new class34(2, var2)); // L: 110
		}

		var1.consume(); // L: 112
	} // L: 113

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') { // L: 117
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label49: {
					if (var2 != 0) { // L: 124
						char[] var4 = class358.cp1252AsciiExtension;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5]; // L: 128
							if (var6 == var2) {
								var3 = true;
								break label49;
							}
						}
					}

					var3 = false; // L: 138
				}
			} else {
				var3 = true;
			}

			if (var3) {
				this.field144.add(new class34(3, var2)); // L: 141
			}
		}

		var1.consume(); // L: 144
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field144.add(new class34(4, 1)); // L: 154
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 158
			if (this.field146[var2]) { // L: 159
				this.field146[var2] = false; // L: 160
				this.field144.add(new class34(2, var2)); // L: 161
			}
		}

		this.field144.add(new class34(4, 0)); // L: 164
	} // L: 165

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lgw;B)V",
		garbageValue = "-63"
	)
	static final void method364(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 114
			for (var12 = 0; var12 < 8; ++var12) { // L: 115
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 116
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 119

		for (var12 = 0; var12 < 4; ++var12) { // L: 120
			for (int var13 = 0; var13 < 64; ++var13) { // L: 121
				for (int var14 = 0; var14 < 64; ++var14) { // L: 122
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 123
						int var17 = var13 & 7; // L: 126
						int var18 = var14 & 7; // L: 127
						int var19 = var7 & 3; // L: 130
						int var16;
						if (var19 == 0) { // L: 131
							var16 = var17; // L: 132
						} else if (var19 == 1) { // L: 135
							var16 = var18; // L: 136
						} else if (var19 == 2) { // L: 139
							var16 = 7 - var17; // L: 140
						} else {
							var16 = 7 - var18; // L: 143
						}

						int var20 = var2 + var16; // L: 145
						int var21 = var3 + class18.method266(var13 & 7, var14 & 7, var7); // L: 146
						int var22 = (var13 & 7) + var8 + var2; // L: 147
						int var23 = var3 + (var14 & 7) + var9; // L: 148
						Messages.loadTerrain(var24, var1, var20, var21, var22, var23, var7); // L: 149
					} else {
						Messages.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 151
					}
				}
			}
		}

	} // L: 155

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-107"
	)
	static void method379() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) { // L: 62
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "94"
	)
	static int method378(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 4870
			int var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4871
			NPCComposition var6 = class129.getNpcDefinition(var5); // L: 4872
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 4873
			return 1; // L: 4874
		} else if (var0 == 6764) { // L: 4876
			class87.Interpreter_intStackSize -= 2; // L: 4877
			NPCComposition var3 = class129.getNpcDefinition(class87.Interpreter_intStackSize); // L: 4878
			int var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4879
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method3663(var4); // L: 4880
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method3673(var4); // L: 4881
			return 1; // L: 4882
		} else {
			return 2; // L: 4884
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Z",
		garbageValue = "-969832307"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11022
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11023
				int var2 = GraphicsObject.method2025(var0, var1); // L: 11024
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11025
				if (var0.cs1Comparisons[var1] == 2) { // L: 11026
					if (var2 >= var3) { // L: 11027
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11029
					if (var2 <= var3) { // L: 11030
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11032
					if (var3 == var2) { // L: 11033
						return false;
					}
				} else if (var2 != var3) { // L: 11035
					return false;
				}
			}

			return true; // L: 11037
		}
	}
}
