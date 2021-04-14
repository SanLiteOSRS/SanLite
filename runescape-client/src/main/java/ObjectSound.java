import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		signature = "Lm;"
	)
	static class11 field928;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1467616233
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -691366272
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 202115712
	)
	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 692165504
	)
	int field916;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 606469859
	)
	int field917;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 948333273
	)
	int field918;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1224516347
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lbk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -300336185
	)
	int field921;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1348614677
	)
	int field922;
	@ObfuscatedName("m")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 57547595
	)
	int field924;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lbk;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lkj;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1410090359"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field918 = var2.int4 * 128;
			this.field921 = var2.int5;
			this.field922 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field918 = 0;
			this.field921 = 0;
			this.field922 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			Huffman.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)J",
		garbageValue = "0"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < class378.field4146) {
			class378.field4145 += class378.field4146 - var0;
		}

		class378.field4146 = var0;
		return var0 + class378.field4145;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "-23572140"
	)
	static long method1798() {
		try {
			URL var0 = new URL(FontName.method6285("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;ZIS)V",
		garbageValue = "12426"
	)
	static void method1796(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class5.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Client.leftTitleSprite = WorldMapDecorationType.convertJpgToSprite(var4);
			ArchiveDiskActionHandler.rightTitleSprite = Client.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			TileItem.titleboxSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Interpreter.titlebuttonSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.runesSprite = Players.method2284(var1, "runes", "");
			class373.title_muteSprite = Players.method2284(var1, "title_mute", "");
			TileItem.options_buttons_0Sprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UrlRequester.field1400 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Skeleton.options_buttons_2Sprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			VarcInt.field3429 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class225.field2777 = TileItem.options_buttons_0Sprite.subWidth;
			class34.field232 = TileItem.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class139.field1560 = 0;
			Bounds.otp = "";
			Login.field1005 = true;
			Login.worldSelectOpen = false;
			if (!Login.clientPreferences.titleMusicDisabled) {
				WorldMapRectangle.method3103(2, class8.archive6, "scape main", "", 255, false);
			} else {
				PacketWriter.method2368(2);
			}

			class246.method4409(false);
			class5.clearLoginScreen = true;
			Login.xPadding = (InterfaceParent.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			GraphicsObject.loginBoxCenter = Login.loginBoxX + 180;
			Client.leftTitleSprite.drawAt(Login.xPadding, 0);
			ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1063868291"
	)
	public static boolean method1797(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
