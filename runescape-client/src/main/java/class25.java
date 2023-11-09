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

@ObfuscatedName("af")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Ltr;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ah")
	Collection field121;
	@ObfuscatedName("ar")
	Collection field122;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field123;
	@ObfuscatedName("ab")
	boolean[] field125;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1911505513
	)
	volatile int field120;

	class25() {
		this.field123 = new class29[3]; // L: 16
		this.field125 = new boolean[112]; // L: 17
		this.field120 = 0; // L: 18
		this.field121 = new ArrayList(100); // L: 21
		this.field122 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "-22982573"
	)
	void method379(class29 var1, int var2) {
		this.field123[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2119301753"
	)
	int method360() {
		return this.field120; // L: 30
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "54"
	)
	void method361(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-62"
	)
	synchronized void method362(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field121.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1170925164"
	)
	void method358() {
		++this.field120; // L: 48
		this.method365(); // L: 49
		Iterator var1 = this.field122.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field123.length && !var2.method491(this.field123[var3]); ++var3) { // L: 53 54
			}
		}

		this.field122.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5600"
	)
	synchronized void method365() {
		Collection var1 = this.field122; // L: 118
		this.field122 = this.field121; // L: 119
		this.field121 = var1; // L: 120
	} // L: 121

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 64
		if (var2 >= 0 && var2 < WorldMapRectangle.method4927()) { // L: 65
			int var3 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 68
			var2 = var3; // L: 70
			boolean var4 = (var3 & 128) != 0; // L: 73
			if (var4) { // L: 75
				var2 = -1;
			}
		} else {
			var2 = -1; // L: 78
		}

		if (var2 >= 0) { // L: 80
			if (!this.field125[var2]) { // L: 81
				this.field120 = 0; // L: 82
			}

			this.field125[var2] = true; // L: 84
			this.field121.add(new class33(1, var2)); // L: 85
		}

		var1.consume(); // L: 87
	} // L: 88

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 110
		if (var2 != 0 && var2 != '\uffff' && WorldMapArea.method4577(var2)) { // L: 111
			this.field121.add(new class33(3, var2)); // L: 112
		}

		var1.consume(); // L: 114
	} // L: 115

	public final synchronized void focusGained(FocusEvent var1) {
		this.field121.add(new class33(4, 1)); // L: 124
	} // L: 125

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 128
			if (this.field125[var2]) { // L: 129
				this.field125[var2] = false; // L: 130
				this.field121.add(new class33(2, var2)); // L: 131
			}
		}

		this.field121.add(new class33(4, 0)); // L: 134
	} // L: 135

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 91
		if (var2 >= 0 && var2 < WorldMapRectangle.method4927()) { // L: 92
			int var3 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 95
			var2 = var3 & -129; // L: 97
		} else {
			var2 = -1; // L: 100
		}

		if (var2 >= 0) { // L: 102
			this.field125[var2] = false; // L: 103
			this.field121.add(new class33(2, var2)); // L: 104
		}

		var1.consume(); // L: 106
	} // L: 107

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "76"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 155
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "-2097696373"
	)
	static final void method391(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		GrandExchangeOfferTotalQuantityComparator.method7091(var0, var1, var2, var3, var4, var5, var6, false); // L: 10347
	} // L: 10348
}
