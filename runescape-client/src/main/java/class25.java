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

@ObfuscatedName("ap")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("gw")
	static String field119;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	static SpritePixels field118;
	@ObfuscatedName("aw")
	Collection field114;
	@ObfuscatedName("al")
	Collection field116;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field115;
	@ObfuscatedName("ar")
	boolean[] field117;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 608013177
	)
	volatile int field113;

	class25() {
		this.field115 = new class29[3]; // L: 16
		this.field117 = new boolean[112]; // L: 17
		this.field113 = 0; // L: 18
		this.field114 = new ArrayList(100); // L: 21
		this.field116 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "100415818"
	)
	void method337(class29 var1, int var2) {
		this.field115[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1183692105"
	)
	int method323() {
		return this.field113; // L: 30
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "1"
	)
	void method324(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1423851275"
	)
	synchronized void method325(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field114.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	void method326() {
		++this.field113; // L: 48
		this.method352(); // L: 49
		Iterator var1 = this.field116.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field115.length && !var2.method451(this.field115[var3]); ++var3) { // L: 53 54
			}
		}

		this.field116.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-361948226"
	)
	synchronized void method352() {
		Collection var1 = this.field116; // L: 134
		this.field116 = this.field114; // L: 135
		this.field114 = var1; // L: 136
	} // L: 137

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label28: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 75
					var2 = var5; // L: 77
					boolean var6 = (var5 & 128) != 0; // L: 80
					if (var6) { // L: 82
						var2 = -1;
					}
					break label28;
				}
			}

			var2 = -1; // L: 86
		}

		if (var2 >= 0) { // L: 88
			if (!this.field117[var2]) { // L: 89
				this.field113 = 0; // L: 90
			}

			this.field117[var2] = true; // L: 92
			this.field114.add(new class33(1, var2)); // L: 93
		}

		var1.consume(); // L: 95
	} // L: 96

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 99
			if (var2 >= 0) { // L: 101
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 105
				if (var2 < var4) { // L: 107
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 110
					var2 = var5 & -129; // L: 112
					break label17;
				}
			}

			var2 = -1; // L: 116
		}

		if (var2 >= 0) { // L: 118
			this.field117[var2] = false; // L: 119
			this.field114.add(new class33(2, var2)); // L: 120
		}

		var1.consume(); // L: 122
	} // L: 123

	public final synchronized void focusGained(FocusEvent var1) {
		this.field114.add(new class33(4, 1)); // L: 140
	} // L: 141

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 144
			if (this.field117[var2]) { // L: 145
				this.field117[var2] = false; // L: 146
				this.field114.add(new class33(2, var2)); // L: 147
			}
		}

		this.field114.add(new class33(4, 0)); // L: 150
	} // L: 151

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 126
		if (var2 != 0 && var2 != '\uffff' && class237.method4616(var2)) { // L: 127
			this.field114.add(new class33(3, var2)); // L: 128
		}

		var1.consume(); // L: 130
	} // L: 131

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	static void method342() {
		if (Client.field656) { // L: 5115
			class475.addPlayerToScene(VarpDefinition.localPlayer, false); // L: 5116
		}

	} // L: 5118
}
