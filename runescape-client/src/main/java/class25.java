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

@ObfuscatedName("ai")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field115;
	@ObfuscatedName("jr")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("an")
	Collection field109;
	@ObfuscatedName("ar")
	Collection field118;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field111;
	@ObfuscatedName("at")
	boolean[] field110;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1839518589
	)
	volatile int field113;

	class25() {
		this.field111 = new class29[3]; // L: 16
		this.field110 = new boolean[112]; // L: 17
		this.field113 = 0; // L: 18
		this.field109 = new ArrayList(100); // L: 21
		this.field118 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IB)V",
		garbageValue = "-70"
	)
	void method351(class29 var1, int var2) {
		this.field111[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-91339865"
	)
	public int method343() {
		return this.field113;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-8"
	)
	void method333(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "3"
	)
	synchronized void method334(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this);
		synchronized(this) { // L: 42
			this.field109.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082566883"
	)
	void method335() {
		++this.field113; // L: 48
		this.method362();
		Iterator var1 = this.field118.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field111.length && !var2.method471(this.field111[var3]); ++var3) { // L: 53 54
			}
		}

		this.field118.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1739555206"
	)
	synchronized void method362() {
		Collection var1 = this.field118; // L: 124
		this.field118 = this.field109; // L: 125
		this.field109 = var1; // L: 126
	} // L: 127

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					var2 = method366(var2); // L: 73
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
			this.field110[var2] = true; // L: 85
			this.field109.add(new class33(1, var2)); // L: 86
			this.field113 = 0; // L: 87
		}

		var1.consume(); // L: 89
	} // L: 90

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 93
			if (var2 >= 0) { // L: 95
				int var4 = KeyHandler.KeyHandler_keyCodes.length;
				if (var2 < var4) { // L: 101
					var2 = method366(var2) & -129; // L: 102
					break label17;
				}
			}

			var2 = -1; // L: 106
		}

		if (var2 >= 0) { // L: 108
			this.field110[var2] = false; // L: 109
			this.field109.add(new class33(2, var2)); // L: 110
		}

		var1.consume(); // L: 112
	} // L: 113

	public final synchronized void focusGained(FocusEvent var1) {
		this.field109.add(new class33(4, 1)); // L: 130
	} // L: 131

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 134
			if (this.field110[var2]) { // L: 135
				this.field110[var2] = false; // L: 136
				this.field109.add(new class33(2, var2)); // L: 137
			}
		}

		this.field109.add(new class33(4, 0)); // L: 140
	} // L: 141

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 116
		if (var2 != 0 && var2 != '\uffff' && PendingSpawn.method2346(var2)) { // L: 117
			this.field109.add(new class33(3, var2)); // L: 118
		}

		var1.consume(); // L: 120
	} // L: 121

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1505828450"
	)
	static int method366(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "51"
	)
	public static byte[] method332(Object var0, boolean var1) {
		if (var0 == null) { // L: 30
			return null;
		} else if (var0 instanceof byte[]) { // L: 31
			byte[] var6 = (byte[])((byte[])var0); // L: 32
			if (var1) { // L: 33
				int var4 = var6.length; // L: 36
				byte[] var5 = new byte[var4]; // L: 37
				System.arraycopy(var6, 0, var5, 0, var4); // L: 38
				return var5; // L: 41
			} else {
				return var6; // L: 43
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 45
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 46
			return var2.get(); // L: 47
		} else {
			throw new IllegalArgumentException(); // L: 49
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219016638"
	)
	static void method368() {
		Client.menuOptionsCount = 0; // L: 8878
		Client.isMenuOpen = false; // L: 8879
	} // L: 8880
}
