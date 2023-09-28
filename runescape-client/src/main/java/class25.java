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

@ObfuscatedName("ad")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("bf")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("al")
	Collection field126;
	@ObfuscatedName("ak")
	Collection field131;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	class29[] field127;
	@ObfuscatedName("ao")
	boolean[] field128;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -690846649
	)
	volatile int field124;

	class25() {
		this.field127 = new class29[3]; // L: 16
		this.field128 = new boolean[112]; // L: 17
		this.field124 = 0; // L: 18
		this.field126 = new ArrayList(100); // L: 21
		this.field131 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbd;IB)V",
		garbageValue = "14"
	)
	void method347(class29 var1, int var2) {
		this.field127[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	int method345() {
		return this.field124; // L: 30
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-86"
	)
	void method343(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "28"
	)
	synchronized void method357(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field126.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2131622455"
	)
	void method348() {
		++this.field124; // L: 48
		this.method360(); // L: 49
		Iterator var1 = this.field131.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field127.length && !var2.method475(this.field127[var3]); ++var3) { // L: 53 54
			}
		}

		this.field131.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	synchronized void method360() {
		Collection var1 = this.field131; // L: 148
		this.field131 = this.field126; // L: 149
		this.field126 = var1; // L: 150
	} // L: 151

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 116
		if (var2 != 0 && var2 != '\uffff') { // L: 117
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 120
				var3 = true; // L: 121
			} else {
				label54: {
					if (var2 != 0) { // L: 124
						char[] var4 = class399.cp1252AsciiExtension; // L: 126

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 127
							char var6 = var4[var5]; // L: 128
							if (var2 == var6) { // L: 130
								var3 = true; // L: 131
								break label54;
							}
						}
					}

					var3 = false; // L: 138
				}
			}

			if (var3) { // L: 140
				this.field126.add(new class33(3, var2)); // L: 141
			}
		}

		var1.consume(); // L: 144
	} // L: 145

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 93
			if (var2 >= 0) { // L: 95
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 99
				if (var2 < var4) { // L: 101
					var2 = MouseRecorder.method2337(var2) & -129; // L: 102
					break label17;
				}
			}

			var2 = -1; // L: 106
		}

		if (var2 >= 0) { // L: 108
			this.field128[var2] = false; // L: 109
			this.field126.add(new class33(2, var2)); // L: 110
		}

		var1.consume(); // L: 112
	} // L: 113

	public final synchronized void focusGained(FocusEvent var1) {
		this.field126.add(new class33(4, 1)); // L: 154
	} // L: 155

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 158
			if (this.field128[var2]) { // L: 159
				this.field128[var2] = false; // L: 160
				this.field126.add(new class33(2, var2)); // L: 161
			}
		}

		this.field126.add(new class33(4, 0)); // L: 164
	} // L: 165

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					var2 = MouseRecorder.method2337(var2); // L: 73
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
			this.field128[var2] = true; // L: 85
			this.field126.add(new class33(1, var2)); // L: 86
			this.field124 = 0; // L: 87
		}

		var1.consume(); // L: 89
	} // L: 90

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1253121225"
	)
	public static void method344() {
		class214.archive4.clear(); // L: 14
	} // L: 15
}
