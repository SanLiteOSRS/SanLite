import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class20 extends class16 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1884586225
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1810186183
	)
	int field158;
	@ObfuscatedName("o")
	byte field164;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -950803681
	)
	int field163;
	@ObfuscatedName("p")
	String field160;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		signature = "(Lx;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field158 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		this.field158 = var1.readUnsignedShort();
		this.field164 = var1.readByte();
		this.field163 = var1.readUnsignedShort();
		var1.readLong();
		this.field160 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = (class9)var1.field27.get(this.field158);
		var2.field66 = this.field164;
		var2.field64 = this.field163;
		var2.field65 = this.field160;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1867749847"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class10.client.method594();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field633 = 0;
				Client.field634 = 0;
				Client.timer.method5579(var0);
				if (var0 != 20) {
					TriBool.method5818(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field686 != null) {
				Client.field686.close();
				Client.field686 = null;
			}

			if (Client.gameState == 25) {
				Client.field659 = 0;
				Client.field655 = 0;
				Client.field656 = 1;
				Client.field657 = 0;
				Client.field752 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					ObjectSound.method1796(class373.archive10, SoundSystem.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					ObjectSound.method1796(class373.archive10, SoundSystem.archive8, false, 4);
				} else if (class5.clearLoginScreen) {
					TileItem.titleboxSprite = null;
					Interpreter.titlebuttonSprite = null;
					Login.runesSprite = null;
					Client.leftTitleSprite = null;
					ArchiveDiskActionHandler.rightTitleSprite = null;
					class125.logoSprite = null;
					class373.title_muteSprite = null;
					TileItem.options_buttons_0Sprite = null;
					Skeleton.options_buttons_2Sprite = null;
					Tile.worldSelectBackSprites = null;
					ByteArrayPool.worldSelectFlagSprites = null;
					class6.worldSelectArrows = null;
					class13.worldSelectStars = null;
					class242.field2900 = null;
					Login.loginScreenRunesAnimation.method2192();
					PacketWriter.method2368(2);
					class246.method4409(true);
					class5.clearLoginScreen = false;
				}
			} else {
				ObjectSound.method1796(class373.archive10, SoundSystem.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-431696930"
	)
	static final void method304(boolean var0) {
		BoundaryObject.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field737 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field737 = true;
				}
			}

		}
	}
}
