import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1812147417
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 579716858626638199L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ai")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ar")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Luq;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method7298(2); // L: 118
		this.grandExchangeOffer.method7299(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-4882"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-281103104"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "1254503971"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3870
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3871
				SpriteMask var3 = var0.method6801(ArchiveLoader.field1070, true); // L: 3872
				if (var3 == null) { // L: 3873
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3874
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3875
				if (var3.contains(var4, var5)) { // L: 3876
					var4 -= var3.width / 2; // L: 3877
					var5 -= var3.height / 2; // L: 3878
					int var6 = Client.camAngleY & 2047; // L: 3879
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3880
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3881
					int var9 = var8 * var4 + var5 * var7 >> 11; // L: 3882
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3883
					int var11 = var9 + VarpDefinition.localPlayer.x >> 7; // L: 3884
					int var12 = VarpDefinition.localPlayer.y - var10 >> 7; // L: 3885
					PacketBufferNode var13 = ViewportMouse.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 3887
					var13.packetBuffer.writeByte(18); // L: 3888
					var13.packetBuffer.method9505(Client.field792.method4466(82) ? (Client.field792.method4466(81) ? 2 : 1) : 0); // L: 3889
					var13.packetBuffer.method9548(Projectile.baseX * 64 + var11); // L: 3890
					var13.packetBuffer.method9548(GameEngine.baseY * 8 + var12); // L: 3891
					var13.packetBuffer.writeByte(var4); // L: 3892
					var13.packetBuffer.writeByte(var5); // L: 3893
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3894
					var13.packetBuffer.writeByte(57); // L: 3895
					var13.packetBuffer.writeByte(0); // L: 3896
					var13.packetBuffer.writeByte(0); // L: 3897
					var13.packetBuffer.writeByte(89); // L: 3898
					var13.packetBuffer.writeShort(VarpDefinition.localPlayer.x); // L: 3899
					var13.packetBuffer.writeShort(VarpDefinition.localPlayer.y); // L: 3900
					var13.packetBuffer.writeByte(63); // L: 3901
					Client.packetWriter.addNode(var13); // L: 3902
					Client.destinationX = var11; // L: 3903
					Client.destinationY = var12; // L: 3904
				}
			}

		}
	} // L: 3907
}
