import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	static Widget field79;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 152068117
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 3809481130081136381L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lv;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("t")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("i")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		signature = "(Lkf;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method189(2);
		this.grandExchangeOffer.method184(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-820260328"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "2082763364"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "(Ljm;IIIB)V",
		garbageValue = "6"
	)
	@Export("addSequenceSoundEffect")
	static void addSequenceSoundEffect(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Client.areaSoundEffectVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "(Lhq;III)V",
		garbageValue = "-570952041"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var4 * var8 + var5 * var7 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + WorldMapLabelSize.localPlayer.x >> 7;
					int var12 = WorldMapLabelSize.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = Client.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method5654(WorldMapManager.baseX * 64 + var11);
					var13.packetBuffer.writeShort(WorldMapLabel.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(WorldMapLabelSize.localPlayer.x);
					var13.packetBuffer.writeShort(WorldMapLabelSize.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "33"
	)
	static void method160() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2341, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class39.getWindowedMode());
		var0.packetBuffer.writeShort(FloorDecoration.canvasWidth);
		var0.packetBuffer.writeShort(GameEngine.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
