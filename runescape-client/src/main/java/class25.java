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
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 2083910077
	)
	static int field137;
	@ObfuscatedName("an")
	Collection field132;
	@ObfuscatedName("aw")
	Collection field131;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lbe;"
	)
	class29[] field135;
	@ObfuscatedName("au")
	boolean[] field134;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 581428417
	)
	volatile int field133;

	class25() {
		this.field135 = new class29[3]; // L: 16
		this.field134 = new boolean[112]; // L: 17
		this.field133 = 0; // L: 18
		this.field132 = new ArrayList(100); // L: 21
		this.field131 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbe;II)V",
		garbageValue = "107693889"
	)
	void method353(class29 var1, int var2) {
		this.field135[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public int method354() {
		return this.field133; // L: 30
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "64"
	)
	void method355(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-2015254392"
	)
	synchronized void method370(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field132.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "190164456"
	)
	void method357() {
		++this.field133; // L: 48
		this.method360(); // L: 49
		Iterator var1 = this.field131.iterator(); // L: 50

		while (var1.hasNext()) { // L: 59
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field135.length && !var2.method499(this.field135[var3]); ++var3) { // L: 53 54
			}
		}

		this.field131.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	synchronized void method360() {
		Collection var1 = this.field131; // L: 148
		this.field131 = this.field132; // L: 149
		this.field132 = var1; // L: 150
	} // L: 151

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 116
		if (var2 != 0 && var2 != '\uffff') { // L: 117
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 120
				var3 = true; // L: 121
			} else {
				label53: {
					if (var2 != 0) { // L: 124
						char[] var4 = class369.cp1252AsciiExtension; // L: 126

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 127
							char var6 = var4[var5]; // L: 128
							if (var6 == var2) { // L: 130
								var3 = true; // L: 131
								break label53;
							}
						}
					}

					var3 = false; // L: 138
				}
			}

			if (var3) { // L: 140
				this.field132.add(new class33(3, var2)); // L: 141
			}
		}

		var1.consume(); // L: 144
	} // L: 145

	public final synchronized void focusGained(FocusEvent var1) {
		this.field132.add(new class33(4, 1)); // L: 154
	} // L: 155

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 158
			if (this.field134[var2]) { // L: 159
				this.field134[var2] = false; // L: 160
				this.field132.add(new class33(2, var2)); // L: 161
			}
		}

		this.field132.add(new class33(4, 0)); // L: 164
	} // L: 165

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					var2 = ViewportMouse.method4908(var2); // L: 73
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
			this.field134[var2] = true; // L: 85
			this.field132.add(new class33(1, var2)); // L: 86
			this.field133 = 0; // L: 87
		}

		var1.consume(); // L: 89
	} // L: 90

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 93
			if (var2 >= 0) { // L: 95
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 99
				if (var2 < var4) { // L: 101
					var2 = ViewportMouse.method4908(var2) & -129; // L: 102
					break label17;
				}
			}

			var2 = -1; // L: 106
		}

		if (var2 >= 0) { // L: 108
			this.field134[var2] = false; // L: 109
			this.field132.add(new class33(2, var2)); // L: 110
		}

		var1.consume(); // L: 112
	} // L: 113

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	public static int method389() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("an")
	public static double method390(double var0, double var2, double var4) {
		return class138.method3201((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;ZIB)V",
		garbageValue = "-43"
	)
	static void method366(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class12.clearLoginScreen) { // L: 184
			if (var3 == 4) { // L: 185
				class129.method3124(4); // L: 186
			}

		} else {
			if (var3 == 0) { // L: 190
				Login.method2100(var2); // L: 191
			} else {
				class129.method3124(var3); // L: 194
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 196
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 197
			class123.leftTitleSprite = Strings.method6601(var4); // L: 198
			ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally(); // L: 199
			int var5 = Client.worldProperties; // L: 200
			if ((var5 & 536870912) != 0) { // L: 202
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 203
			} else if ((var5 & 1073741824) != 0) { // L: 205
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 206
			} else if ((var5 & 256) != 0) { // L: 208
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 209
			} else {
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 212
			}

			Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 215
			class292.field3361 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 216
			class439.field4717 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 217
			class376.field4398 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 218
			MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 219
			class396.field4533 = class314.method6353(var1, "runes", ""); // L: 220
			class148.title_muteSprite = class314.method6353(var1, "title_mute", ""); // L: 221
			Login.field892 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 222
			Login.field893 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 223
			class158.field1766 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 224
			Login.field907 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 225
			ChatChannel.field992 = Login.field892.subWidth; // L: 226
			FloorUnderlayDefinition.field2096 = Login.field892.subHeight; // L: 227
			class121.loginScreenRunesAnimation = new LoginScreenAnimation(class396.field4533); // L: 228
			if (var2) { // L: 229
				Login.Login_username = ""; // L: 230
				Login.Login_password = ""; // L: 231
				Login.field910 = new String[8]; // L: 232
				Login.field909 = 0; // L: 233
			}

			class204.field2330 = 0; // L: 235
			Messages.otp = ""; // L: 236
			Login.field914 = true; // L: 237
			Login.worldSelectOpen = false; // L: 238
			if (!class20.clientPreferences.method2534()) { // L: 239
				class282.method5684(2, class399.archive6, "scape main", "", 255, false);
			} else {
				class297.musicPlayerStatus = 1; // L: 241
				class297.musicTrackArchive = null; // L: 242
				class379.musicTrackGroupId = -1; // L: 243
				VarpDefinition.musicTrackFileId = -1; // L: 244
				class100.musicTrackVolume = 0; // L: 245
				class120.musicTrackBoolean = false; // L: 246
				class162.pcmSampleLength = 2; // L: 247
			}

			class177.method3617(false); // L: 249
			class12.clearLoginScreen = true; // L: 250
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 251
			Login.loginBoxX = Login.xPadding + 202; // L: 252
			class143.loginBoxCenter = Login.loginBoxX + 180; // L: 253
			class123.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 254
			ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 255
			Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 256
		}
	} // L: 188 257

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIII)V",
		garbageValue = "1996468807"
	)
	static void method386(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class20.clientPreferences.method2465() != 0) { // L: 3486
			if (var0.field2311 != null && var0.field2311.containsKey(var1)) { // L: 3487
				class161.method3447((Integer)var0.field2311.get(var1), var2, var3); // L: 3488
			}
		}
	} // L: 3489

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	static final void method379() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8021 8022 8028
			if (var0.hitpoints == -1) { // L: 8023
				var0.delay = 0; // L: 8024
				Messages.method2763(var0); // L: 8025
			} else {
				var0.remove(); // L: 8027
			}
		}

	} // L: 8030

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)I",
		garbageValue = "311252747"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12062
		return var1 != null ? var1.integer : var0.flags; // L: 12063 12064
	}
}
