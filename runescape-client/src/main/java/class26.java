import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class26 implements KeyListener, FocusListener {
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -221852981
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ib")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	Collection field143;
	@ObfuscatedName("c")
	Collection field136;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	class30[] field134;
	@ObfuscatedName("h")
	boolean[] field137;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 453646007
	)
	volatile int field139;

	class26() {
		this.field134 = new class30[3];
		this.field137 = new boolean[112]; // L: 17
		this.field139 = 0; // L: 18
		this.field143 = new ArrayList(100); // L: 21
		this.field136 = new ArrayList(100);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lac;II)V",
		garbageValue = "1024395417"
	)
	void method384(class30 var1, int var2) {
		this.field134[var2] = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1886743487"
	)
	public int method353() {
		return this.field139;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "100151864"
	)
	void method354(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-2141322071"
	)
	synchronized void method355(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field143.add(new class34(4, 0));
		}
	} // L: 45

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "753276149"
	)
	void method356() {
		++this.field139;
		this.method358(); // L: 49
		Iterator var1 = this.field136.iterator(); // L: 50

		while (var1.hasNext()) {
			class34 var2 = (class34)var1.next();

			for (int var3 = 0; var3 < this.field134.length && !var2.method501(this.field134[var3]); ++var3) { // L: 53 54
			}
		}

		this.field136.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2113194361"
	)
	synchronized void method358() {
		Collection var1 = this.field136; // L: 156
		this.field136 = this.field143; // L: 157
		this.field143 = var1; // L: 158
	} // L: 159

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 75
					var2 = var5; // L: 77
					boolean var6 = (var5 & 128) != 0; // L: 80
					if (var6) { // L: 82
						var2 = -1;
					}
					break label24;
				}
			}

			var2 = -1; // L: 86
		}

		if (var2 >= 0) { // L: 88
			this.field137[var2] = true; // L: 89
			this.field143.add(new class34(1, var2)); // L: 90
			this.field139 = 0; // L: 91
		}

		var1.consume(); // L: 93
	} // L: 94

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 97
			if (var2 >= 0) { // L: 99
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 103
				if (var2 < var4) { // L: 105
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 108
					var2 = var5 & -129; // L: 110
					break label17;
				}
			}

			var2 = -1; // L: 114
		}

		if (var2 >= 0) { // L: 116
			this.field137[var2] = false; // L: 117
			this.field143.add(new class34(2, var2)); // L: 118
		}

		var1.consume(); // L: 120
	} // L: 121

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 166
			if (this.field137[var2]) { // L: 167
				this.field137[var2] = false; // L: 168
				this.field143.add(new class34(2, var2)); // L: 169
			}
		}

		this.field143.add(new class34(4, 0)); // L: 172
	} // L: 173

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 124
		if (var2 != 0 && var2 != '\uffff') { // L: 125
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 128
				label49: {
					if (var2 != 0) { // L: 132
						char[] var4 = class355.cp1252AsciiExtension; // L: 134

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 135
							char var6 = var4[var5]; // L: 136
							if (var2 == var6) { // L: 138
								var3 = true; // L: 139
								break label49; // L: 140
							}
						}
					}

					var3 = false; // L: 146
				}
			} else {
				var3 = true; // L: 129
			}

			if (var3) { // L: 148
				this.field143.add(new class34(3, var2)); // L: 149
			}
		}

		var1.consume(); // L: 152
	} // L: 153

	public final synchronized void focusGained(FocusEvent var1) {
		this.field143.add(new class34(4, 1)); // L: 162
	} // L: 163

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)Lri;",
		garbageValue = "25"
	)
	public static final SpritePixels method394(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) {
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1852147912"
	)
	public static char method369(char var0) {
		switch(var0) { // L: 16
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 48
		case '#':
		case '[':
		case ']':
			return var0; // L: 23
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 43
		case 'Ç':
		case 'ç':
			return 'c'; // L: 19
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 32
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 85
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 51
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 62
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 76
		case 'ß':
			return 'b'; // L: 64
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 67
		default:
			return Character.toLowerCase(var0); // L: 78
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "2"
	)
	static int method393(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class457 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4923
			if (var0 != 7501) { // L: 4945
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4954
					class379.Interpreter_intStackSize -= 3; // L: 4955
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4956
					var19 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4957
					var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 4958
					var20 = class413.method7766(var19); // L: 4959
					var7 = ArchiveDiskActionHandler.method6293(var19); // L: 4960
					int var21 = ObjectSound.method1855(var19); // L: 4961
					class458 var26 = class153.method3196(var3); // L: 4962
					class456 var27 = PcmPlayer.method842(var20); // L: 4963
					int[] var28 = var27.field4840[var7]; // L: 4964
					int var12 = 0; // L: 4965
					int var13 = var28.length; // L: 4966
					if (var21 >= 0) { // L: 4967
						if (var21 >= var13) { // L: 4968
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4969
						}

						var12 = var21; // L: 4971
						var13 = var21 + 1; // L: 4972
					}

					Object[] var14 = var26.method8307(var7); // L: 4974
					if (var14 == null && var27.field4842 != null) { // L: 4975 4976
						var14 = var27.field4842[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4978
						for (var15 = var12; var15 < var13; ++var15) { // L: 4979
							var16 = var28[var15]; // L: 4980
							class453 var22 = class230.method4679(var16); // L: 4981
							if (var22 == class453.field4836) { // L: 4982
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class341.method6557(var16); // L: 4983
							}
						}

						return 1; // L: 4985
					} else {
						var15 = var14.length / var28.length; // L: 4987
						if (var5 >= 0 && var5 < var15) { // L: 4988
							for (var16 = var12; var16 < var13; ++var16) { // L: 4991
								int var17 = var16 + var28.length * var5; // L: 4992
								class453 var18 = class230.method4679(var28[var16]); // L: 4993
								if (var18 == class453.field4836) { // L: 4994
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4995
								}
							}

							return 1; // L: 4997
						} else {
							throw new RuntimeException(); // L: 4989
						}
					}
				} else if (var0 == 7503) { // L: 4999
					class379.Interpreter_intStackSize -= 2; // L: 5000
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 5001
					var19 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 5002
					var5 = 0; // L: 5003
					var20 = class413.method7766(var19); // L: 5004
					var7 = ArchiveDiskActionHandler.method6293(var19); // L: 5005
					class458 var25 = class153.method3196(var3); // L: 5006
					class456 var9 = PcmPlayer.method842(var20); // L: 5007
					int[] var10 = var9.field4840[var7]; // L: 5008
					Object[] var11 = var25.method8307(var7); // L: 5009
					if (var11 == null && var9.field4842 != null) { // L: 5010 5011
						var11 = var9.field4842[var7]; // L: 5012
					}

					if (var11 != null) { // L: 5015
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5; // L: 5016
					return 1; // L: 5017
				} else if (var0 != 7504 && var0 != 7510) { // L: 5019
					if (var0 == 7505) { // L: 5036
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 5037
						class458 var24 = class153.method3196(var3); // L: 5038
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var24.field4850; // L: 5039
						return 1; // L: 5040
					} else if (var0 == 7506) { // L: 5042
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 5043
						var19 = -1; // L: 5044
						if (MenuAction.field890 != null && var3 >= 0 && var3 < MenuAction.field890.size()) { // L: 5045
							var19 = (Integer)MenuAction.field890.get(var3); // L: 5046
						}

						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var19; // L: 5048
						return 1; // L: 5049
					} else if (var0 != 7507 && var0 != 7509) { // L: 5051
						return 2; // L: 5078
					} else {
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 5052
						var4 = SecureRandomFuture.method2108(var3); // L: 5053
						var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 5054
						var6 = class230.method4680(var5); // L: 5055
						if (var6 == null) { // L: 5056
							throw new RuntimeException(); // L: 5057
						} else if (class413.method7766(var5) != Client.field785) { // L: 5059
							throw new RuntimeException(); // L: 5060
						} else if (MenuAction.field890 == null && MenuAction.field890.isEmpty()) { // L: 5062
							throw new RuntimeException(); // L: 5063
						} else {
							var7 = ObjectSound.method1855(var5); // L: 5065
							List var8 = var6.method8301(var4, var7); // L: 5066
							MenuAction.field890 = new LinkedList(MenuAction.field890); // L: 5067
							if (var8 != null) { // L: 5068
								MenuAction.field890.retainAll(var8); // L: 5069
							} else {
								MenuAction.field890.clear(); // L: 5072
							}

							class100.field1305 = MenuAction.field890.iterator(); // L: 5074
							if (var0 == 7507) { // L: 5075
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.field890.size();
							}

							return 1; // L: 5076
						}
					}
				} else {
					--class379.Interpreter_intStackSize; // L: 5020
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 5021
					class457 var23 = Clock.method3395(var3); // L: 5022
					if (var23 == null) { // L: 5023
						throw new RuntimeException(); // L: 5024
					} else {
						MenuAction.field890 = var23.method8301(0, 0); // L: 5026
						var5 = 0; // L: 5027
						if (MenuAction.field890 != null) { // L: 5028
							Client.field785 = var3; // L: 5029
							class100.field1305 = MenuAction.field890.iterator(); // L: 5030
							var5 = MenuAction.field890.size(); // L: 5031
						}

						if (var0 == 7504) { // L: 5033
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5034
					}
				}
			} else {
				if (class100.field1305 != null && class100.field1305.hasNext()) { // L: 4946
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (Integer)class100.field1305.next(); // L: 4947
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4950
				}

				return 1; // L: 4952
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4924
			var4 = SecureRandomFuture.method2108(var3); // L: 4925
			var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4926
			var6 = class230.method4680(var5); // L: 4927
			if (var6 == null) { // L: 4928
				throw new RuntimeException(); // L: 4929
			} else {
				var7 = ObjectSound.method1855(var5); // L: 4931
				MenuAction.field890 = var6.method8301(var4, var7); // L: 4932
				if (MenuAction.field890 != null) { // L: 4933
					Client.field785 = class413.method7766(var5); // L: 4934
					class100.field1305 = MenuAction.field890.iterator(); // L: 4935
					if (var0 == 7500) { // L: 4936
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MenuAction.field890.size();
					}
				} else {
					Client.field785 = -1; // L: 4939
					class100.field1305 = null; // L: 4940
					if (var0 == 7500) { // L: 4941
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4943
			}
		}
	}
}
