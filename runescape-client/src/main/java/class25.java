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

@ObfuscatedName("at")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -687650621
	)
	static int field131;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 2027274217
	)
	static int field134;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("ap")
	Collection field130;
	@ObfuscatedName("af")
	Collection field127;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	class29[] field133;
	@ObfuscatedName("aq")
	boolean[] field129;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 12807563
	)
	volatile int field128;

	class25() {
		this.field133 = new class29[3]; // L: 16
		this.field129 = new boolean[112]; // L: 17
		this.field128 = 0; // L: 18
		this.field130 = new ArrayList(100); // L: 21
		this.field127 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbt;II)V",
		garbageValue = "-1927926336"
	)
	void method357(class29 var1, int var2) {
		this.field133[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "288397361"
	)
	int method358() {
		return this.field128; // L: 30
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;S)V",
		garbageValue = "28242"
	)
	void method359(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1048369874"
	)
	synchronized void method360(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field130.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-88170892"
	)
	void method379() {
		++this.field128; // L: 48
		this.method362(); // L: 49
		Iterator var1 = this.field127.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field133.length && !var2.method490(this.field133[var3]); ++var3) { // L: 53 54
			}
		}

		this.field127.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	synchronized void method362() {
		Collection var1 = this.field127; // L: 106
		this.field127 = this.field130; // L: 107
		this.field130 = var1; // L: 108
	} // L: 109

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 64
		if (var2 >= 0 && var2 < TileItem.method2762()) { // L: 65
			var2 = SequenceDefinition.method4122(var2); // L: 66
			if (VarbitComposition.method3843(var2)) { // L: 67
				var2 = -1;
			}
		} else {
			var2 = -1; // L: 70
		}

		if (var2 >= 0) { // L: 72
			if (!this.field129[var2]) { // L: 73
				this.field128 = 0; // L: 74
			}

			this.field129[var2] = true; // L: 76
			this.field130.add(new class33(1, var2)); // L: 77
		}

		var1.consume(); // L: 79
	} // L: 80

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode(); // L: 83
		if (var2 >= 0 && var2 < TileItem.method2762()) { // L: 84
			var2 = SequenceDefinition.method4122(var2) & -129; // L: 85
		} else {
			var2 = -1; // L: 88
		}

		if (var2 >= 0) { // L: 90
			this.field129[var2] = false; // L: 91
			this.field130.add(new class33(2, var2)); // L: 92
		}

		var1.consume(); // L: 94
	} // L: 95

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 98
		if (var2 != 0 && var2 != '\uffff' && ApproximateRouteStrategy.method1233(var2)) { // L: 99
			this.field130.add(new class33(3, var2)); // L: 100
		}

		var1.consume(); // L: 102
	} // L: 103

	public final synchronized void focusGained(FocusEvent var1) {
		this.field130.add(new class33(4, 1)); // L: 112
	} // L: 113

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field129[var2]) {
				this.field129[var2] = false; // L: 118
				this.field130.add(new class33(2, var2)); // L: 119
			}
		}

		this.field130.add(new class33(4, 0)); // L: 122
	} // L: 123

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160786456"
	)
	static final void method366() {
		Canvas.method334("You can't add yourself to your own friend list"); // L: 116
	} // L: 117

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-138868805"
	)
	static int method386(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field846 - 7.0D) * 256.0D); // L: 4465
	}
}
