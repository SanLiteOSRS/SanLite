import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field115;
	@ObfuscatedName("ah")
	Collection field114;
	@ObfuscatedName("af")
	Collection field111;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	class29[] field112;
	@ObfuscatedName("an")
	boolean[] field113;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1337548119
	)
	volatile int field110;

	class25() {
		this.field112 = new class29[3]; // L: 16
		this.field113 = new boolean[112]; // L: 17
		this.field110 = 0; // L: 18
		this.field114 = new ArrayList(100); // L: 21
		this.field111 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbf;IB)V",
		garbageValue = "-22"
	)
	void method321(class29 var1, int var2) {
		this.field112[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method352() {
		return this.field110; // L: 30
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "99"
	)
	void method323(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1987914483"
	)
	synchronized void method331(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field114.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059126629"
	)
	void method353() {
		++this.field110; // L: 48
		this.method327(); // L: 49
		Iterator var1 = this.field111.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field112.length && !var2.method455(this.field112[var3]); ++var3) { // L: 53 54
			}
		}

		this.field111.clear(); // L: 60
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1911949904"
	)
	synchronized void method327() {
		Collection var1 = this.field111; // L: 146
		this.field111 = this.field114; // L: 147
		this.field114 = var1; // L: 148
	} // L: 149

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) {
					var2 = DesktopPlatformInfoProvider.method8619(var2);
					if (FloorOverlayDefinition.method4209(var2)) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1; // L: 78
		}

		if (var2 >= 0) { // L: 80
			if (!this.field113[var2]) { // L: 81
				this.field110 = 0; // L: 82
			}

			this.field113[var2] = true; // L: 84
			this.field114.add(new class33(1, var2)); // L: 85
		}

		var1.consume(); // L: 87
	} // L: 88

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 114
		if (var2 != 0 && var2 != '\uffff') { // L: 115
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 118
				var3 = true; // L: 119
			} else {
				label53: {
					if (var2 != 0) { // L: 122
						char[] var4 = class404.cp1252AsciiExtension; // L: 124

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 125
							char var6 = var4[var5]; // L: 126
							if (var2 == var6) { // L: 128
								var3 = true; // L: 129
								break label53;
							}
						}
					}

					var3 = false; // L: 136
				}
			}

			if (var3) { // L: 138
				this.field114.add(new class33(3, var2)); // L: 139
			}
		}

		var1.consume(); // L: 142
	} // L: 143

	public final synchronized void focusGained(FocusEvent var1) {
		this.field114.add(new class33(4, 1)); // L: 152
	} // L: 153

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 91
			if (var2 >= 0) { // L: 93
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 97
				if (var2 < var4) { // L: 99
					var2 = DesktopPlatformInfoProvider.method8619(var2) & -129; // L: 100
					break label17;
				}
			}

			var2 = -1; // L: 104
		}

		if (var2 >= 0) { // L: 106
			this.field113[var2] = false; // L: 107
			this.field114.add(new class33(2, var2)); // L: 108
		}

		var1.consume(); // L: 110
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 156
			if (this.field113[var2]) { // L: 157
				this.field113[var2] = false; // L: 158
				this.field114.add(new class33(2, var2)); // L: 159
			}
		}

		this.field114.add(new class33(4, 0)); // L: 162
	} // L: 163

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Ldn;",
		garbageValue = "-486601539"
	)
	static Script method356(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 57
		if (var2 != null) { // L: 58
			return var2; // L: 59
		} else {
			String var3 = String.valueOf(var0); // L: 61
			int var4 = GrandExchangeOfferOwnWorldComparator.archive12.getGroupId(var3); // L: 62
			if (var4 == -1) { // L: 63
				return null; // L: 64
			} else {
				byte[] var5 = GrandExchangeOfferOwnWorldComparator.archive12.takeFileFlat(var4); // L: 66
				if (var5 != null) { // L: 67
					if (var5.length <= 1) { // L: 68
						return null; // L: 69
					}

					var2 = FaceNormal.newScript(var5); // L: 71
					if (var2 != null) { // L: 72
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 73
						return var2; // L: 74
					}
				}

				return null; // L: 77
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-71"
	)
	static void method338(int var0) {
		if (var0 != -1) { // L: 5365
			if (class243.field2620.method6285(var0)) { // L: 5366
				Widget[] var1 = class243.field2620.field3645[var0]; // L: 5367

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5368
					Widget var3 = var1[var2]; // L: 5369
					if (var3.onLoad != null) { // L: 5370
						ScriptEvent var4 = new ScriptEvent(); // L: 5371
						var4.widget = var3; // L: 5372
						var4.args = var3.onLoad; // L: 5373
						class139.runScript(var4, 5000000, 0); // L: 5374
					}
				}

			}
		}
	} // L: 5377
}
