import java.applet.Applet;
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

@ObfuscatedName("ak")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 712005029
	)
	static int field124;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -9167837
	)
	static int field123;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ae")
	Collection field133;
	@ObfuscatedName("ao")
	Collection field125;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	class29[] field126;
	@ObfuscatedName("ac")
	boolean[] field127;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1759868525
	)
	volatile int field128;

	class25() {
		this.field126 = new class29[3]; // L: 16
		this.field127 = new boolean[112];
		this.field128 = 0;
		this.field133 = new ArrayList(100);
		this.field125 = new ArrayList(100);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbv;II)V",
		garbageValue = "226491014"
	)
	void method344(class29 var1, int var2) {
		this.field126[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2034769800"
	)
	public int method345() {
		return this.field128;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "77"
	)
	void method343(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	} // L: 37

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "70"
	)
	synchronized void method347(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field133.add(new class33(4, 0)); // L: 43
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2096534148"
	)
	void method348() {
		++this.field128; // L: 48
		this.method374(); // L: 49
		Iterator var1 = this.field125.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field126.length && !var2.method491(this.field126[var3]); ++var3) { // L: 53 54
			}
		}

		this.field125.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1568153203"
	)
	synchronized void method374() {
		Collection var1 = this.field125; // L: 140
		this.field125 = this.field133; // L: 141
		this.field133 = var1; // L: 142
	} // L: 143

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 85
			if (var2 >= 0) { // L: 87
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 91
				if (var2 < var4) { // L: 93
					var2 = JagexCache.method3482(var2) & -129; // L: 94
					break label17;
				}
			}

			var2 = -1; // L: 98
		}

		if (var2 >= 0) { // L: 100
			this.field127[var2] = false;
			this.field133.add(new class33(2, var2)); // L: 102
		}

		var1.consume();
	} // L: 105

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 108
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 112
				var3 = true; // L: 113
			} else {
				label53: {
					if (var2 != 0) { // L: 116
						char[] var4 = class384.cp1252AsciiExtension; // L: 118

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 119
							char var6 = var4[var5]; // L: 120
							if (var6 == var2) { // L: 122
								var3 = true; // L: 123
								break label53;
							}
						}
					}

					var3 = false; // L: 130
				}
			}

			if (var3) { // L: 132
				this.field133.add(new class33(3, var2)); // L: 133
			}
		}

		var1.consume(); // L: 136
	} // L: 137

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 150
			if (this.field127[var2]) { // L: 151
				this.field127[var2] = false; // L: 152
				this.field133.add(new class33(2, var2)); // L: 153
			}
		}

		this.field133.add(new class33(4, 0)); // L: 156
	} // L: 157

	public final synchronized void focusGained(FocusEvent var1) {
		this.field133.add(new class33(4, 1)); // L: 146
	} // L: 147

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 64
		if (var2 >= 0 && var2 < class1.method7()) { // L: 65
			var2 = JagexCache.method3482(var2);
			boolean var3 = (var2 & 128) != 0; // L: 69
			if (var3) { // L: 71
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) { // L: 76
			this.field127[var2] = true;
			this.field133.add(new class33(1, var2)); // L: 78
			this.field128 = 0; // L: 79
		}

		var1.consume(); // L: 81
	} // L: 82

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Lob;II)Lob;",
		garbageValue = "-1278288180"
	)
	@Export("findEnumerated")
	public static class371 findEnumerated(class371[] var0, int var1) {
		class371[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class371 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-2016250661"
	)
	public static void method375(Applet var0, String var1) {
		class31.field170 = var0; // L: 22
		if (var1 != null) { // L: 23
			class31.field169 = var1;
		}

	} // L: 24

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1543892590"
	)
	public static char method378(char var0) {
		switch(var0) { // L: 40
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 45
		case '#':
		case '[':
		case ']':
			return var0; // L: 90
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
			return 'a'; // L: 63
		case 'Ç':
		case 'ç':
			return 'c'; // L: 66
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 52
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 104
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
			return 'o'; // L: 101
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 86
		case 'ß':
			return 'b'; // L: 77
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 107
		default:
			return Character.toLowerCase(var0); // L: 109
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;[II)[Ljava/lang/Object;",
		garbageValue = "-165535984"
	)
	static Object[] method379(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class502 var7 = SequenceDefinition.method4071(var1[var5]); // L: 35
				var3[var6] = var7.method8917(var0); // L: 36
			}
		}

		return var3; // L: 39
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	static void method376(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
