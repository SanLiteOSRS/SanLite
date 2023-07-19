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

@ObfuscatedName("ax")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("aj")
	Collection field121;
	@ObfuscatedName("ac")
	Collection field122;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	class29[] field128;
	@ObfuscatedName("ay")
	boolean[] field124;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -835818411
	)
	volatile int field120;

	class25() {
		this.field128 = new class29[3]; // L: 16
		this.field124 = new boolean[112]; // L: 17
		this.field120 = 0; // L: 18
		this.field121 = new ArrayList(100); // L: 21
		this.field122 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V",
		garbageValue = "-1274109486"
	)
	void method393(class29 var1, int var2) {
		this.field128[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1023134852"
	)
	int method369() {
		return this.field120; // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "39"
	)
	void method374(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "72811605"
	)
	synchronized void method371(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field121.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	void method372() {
		++this.field120; // L: 48
		this.method373(); // L: 49
		Iterator var1 = this.field122.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field128.length && !var2.method499(this.field128[var3]); ++var3) { // L: 53 54
			}
		}

		this.field122.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	synchronized void method373() {
		Collection var1 = this.field122; // L: 156
		this.field122 = this.field121; // L: 157
		this.field121 = var1; // L: 158
	} // L: 159

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
			this.field124[var2] = false; // L: 117
			this.field121.add(new class33(2, var2)); // L: 118
		}

		var1.consume(); // L: 120
	} // L: 121

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
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
					break label24;
				}
			}

			var2 = -1; // L: 86
		}

		if (var2 >= 0) { // L: 88
			this.field124[var2] = true; // L: 89
			this.field121.add(new class33(1, var2)); // L: 90
			this.field120 = 0; // L: 91
		}

		var1.consume(); // L: 93
	} // L: 94

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 124
		if (var2 != 0 && var2 != '\uffff') { // L: 125
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 128
				var3 = true; // L: 129
			} else {
				label53: {
					if (var2 != 0) { // L: 132
						char[] var4 = class384.cp1252AsciiExtension; // L: 134

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 135
							char var6 = var4[var5]; // L: 136
							if (var2 == var6) { // L: 138
								var3 = true; // L: 139
								break label53;
							}
						}
					}

					var3 = false; // L: 146
				}
			}

			if (var3) { // L: 148
				this.field121.add(new class33(3, var2)); // L: 149
			}
		}

		var1.consume(); // L: 152
	} // L: 153

	public final synchronized void focusGained(FocusEvent var1) {
		this.field121.add(new class33(4, 1)); // L: 162
	} // L: 163

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 166
			if (this.field124[var2]) { // L: 167
				this.field124[var2] = false; // L: 168
				this.field121.add(new class33(2, var2)); // L: 169
			}
		}

		this.field121.add(new class33(4, 0)); // L: 172
	} // L: 173

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1616058911"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ObjectSound.friendsChatManager != null) { // L: 12596
			PacketBufferNode var1 = class217.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 12597
			var1.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var0)); // L: 12598
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12599
			Client.packetWriter.addNode(var1); // L: 12600
		}
	} // L: 12601
}
