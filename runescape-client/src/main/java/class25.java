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

@ObfuscatedName("y")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -1000852529
	)
	static int field147;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("w")
	Collection field146;
	@ObfuscatedName("v")
	Collection field153;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lag;"
	)
	class29[] field151;
	@ObfuscatedName("z")
	boolean[] field149;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1971799399
	)
	volatile int field145;

	class25() {
		this.field151 = new class29[3]; // L: 16
		this.field149 = new boolean[112]; // L: 17
		this.field145 = 0; // L: 18
		this.field146 = new ArrayList(100); // L: 21
		this.field153 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lag;IB)V",
		garbageValue = "-21"
	)
	void method352(class29 var1, int var2) {
		this.field151[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2042589970"
	)
	public int method353() {
		return this.field145; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "719186766"
	)
	void method354(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1271861184"
	)
	synchronized void method372(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field146.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	void method356() {
		++this.field145; // L: 48
		this.method351(); // L: 49
		Iterator var1 = this.field153.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field151.length && !var2.method494(this.field151[var3]); ++var3) { // L: 53 54
			}
		}

		this.field153.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-850276975"
	)
	synchronized void method351() {
		Collection var1 = this.field153; // L: 128
		this.field153 = this.field146; // L: 129
		this.field146 = var1; // L: 130
	} // L: 131

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 64
		if (var2 >= 0 && var2 < PcmPlayer.method826()) { // L: 65
			var2 = GrandExchangeOfferUnitPriceComparator.method6729(var2); // L: 66
			if (class203.method4129(var2)) { // L: 67
				var2 = -1;
			}
		} else {
			var2 = -1; // L: 70
		}

		if (var2 >= 0) { // L: 72
			this.field149[var2] = true; // L: 73
			this.field146.add(new class33(1, var2)); // L: 74
			this.field145 = 0; // L: 75
		}

		var1.consume(); // L: 77
	} // L: 78

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 81
		if (var2 >= 0 && var2 < PcmPlayer.method826()) { // L: 82
			var2 = GrandExchangeOfferUnitPriceComparator.method6729(var2) & -129; // L: 83
		} else {
			var2 = -1; // L: 86
		}

		if (var2 >= 0) { // L: 88
			this.field149[var2] = false; // L: 89
			this.field146.add(new class33(2, var2)); // L: 90
		}

		var1.consume(); // L: 92
	} // L: 93

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 96
		if (var2 != 0 && var2 != '\uffff') { // L: 97
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 100
				label50: {
					if (var2 != 0) { // L: 104
						char[] var4 = class362.cp1252AsciiExtension; // L: 106

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 107
							char var6 = var4[var5]; // L: 108
							if (var6 == var2) { // L: 110
								var3 = true; // L: 111
								break label50; // L: 112
							}
						}
					}

					var3 = false; // L: 118
				}
			} else {
				var3 = true; // L: 101
			}

			if (var3) { // L: 120
				this.field146.add(new class33(3, var2)); // L: 121
			}
		}

		var1.consume(); // L: 124
	} // L: 125

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 138
			if (this.field149[var2]) { // L: 139
				this.field149[var2] = false; // L: 140
				this.field146.add(new class33(2, var2)); // L: 141
			}
		}

		this.field146.add(new class33(4, 0)); // L: 144
	} // L: 145

	public final synchronized void focusGained(FocusEvent var1) {
		this.field146.add(new class33(4, 1)); // L: 134
	} // L: 135

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "-1112576285"
	)
	public static String method366(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 186

		for (int var3 = 0; var3 < var1; ++var3) { // L: 187
			var2[var3] = var0;
		}

		return new String(var2); // L: 188
	}
}
