import java.awt.Component;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("al")
	Collection field135;
	@ObfuscatedName("ac")
	Collection field136;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbs;"
	)
	class29[] field137;
	@ObfuscatedName("an")
	boolean[] field134;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 318905171
	)
	volatile int field139;

	class25() {
		this.field137 = new class29[3]; // L: 16
		this.field134 = new boolean[112]; // L: 17
		this.field139 = 0; // L: 18
		this.field135 = new ArrayList(100); // L: 21
		this.field136 = new ArrayList(100); // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbs;II)V",
		garbageValue = "1966830837"
	)
	void method342(class29 var1, int var2) {
		this.field137[var2] = var1;
	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1308553146"
	)
	public int method343() {
		return this.field139; // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1973917956"
	)
	void method344(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "11964527"
	)
	synchronized void method348(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field135.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	void method346() {
		++this.field139; // L: 48
		this.method364();
		Iterator var1 = this.field136.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field137.length && !var2.method472(this.field137[var3]); ++var3) { // L: 54
			}
		}

		this.field136.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1054578134"
	)
	synchronized void method364() {
		Collection var1 = this.field136; // L: 112
		this.field136 = this.field135; // L: 113
		this.field135 = var1; // L: 114
	} // L: 115

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 85
		if (var2 >= 0 && var2 < class365.method6867()) { // L: 86
			int var3 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 89
			var2 = var3 & -129; // L: 91
		} else {
			var2 = -1; // L: 94
		}

		if (var2 >= 0) { // L: 96
			this.field134[var2] = false; // L: 97
			this.field135.add(new class33(2, var2)); // L: 98
		}

		var1.consume(); // L: 100
	} // L: 101

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 104
		if (var2 != 0 && var2 != '\uffff' && WorldMapSection2.method4833(var2)) { // L: 105
			this.field135.add(new class33(3, var2)); // L: 106
		}

		var1.consume(); // L: 108
	} // L: 109

	public final synchronized void focusGained(FocusEvent var1) {
		this.field135.add(new class33(4, 1)); // L: 118
	} // L: 119

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 122
			if (this.field134[var2]) { // L: 123
				this.field134[var2] = false; // L: 124
				this.field135.add(new class33(2, var2)); // L: 125
			}
		}

		this.field135.add(new class33(4, 0)); // L: 128
	} // L: 129

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 64
		if (var2 >= 0 && var2 < class365.method6867()) { // L: 65
			int var3 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 68
			var2 = var3; // L: 70
			if (class385.method7346(var3)) { // L: 71
				var2 = -1;
			}
		} else {
			var2 = -1; // L: 74
		}

		if (var2 >= 0) { // L: 76
			this.field134[var2] = true; // L: 77
			this.field135.add(new class33(1, var2)); // L: 78
			this.field139 = 0; // L: 79
		}

		var1.consume(); // L: 81
	} // L: 82

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "1745561482"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 53
				} catch (Exception var4) { // L: 29
				}
			}

			if (class31.field161.startsWith("win")) { // L: 31
				class166.method3376(var0, 0, "openjs"); // L: 34
			} else if (class31.field161.startsWith("mac")) { // L: 39
				class166.method3376(var0, 1, "openjs"); // L: 40
			} else {
				class166.method3376(var0, 2, "openjs"); // L: 44
			}
		} else {
			class166.method3376(var0, 3, "openjs"); // L: 49
		}

	}
}
