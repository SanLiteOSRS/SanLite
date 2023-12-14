import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static class371 field2556;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 480024893
	)
	@Export("type")
	final int type;
	@ObfuscatedName("au")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljn;",
		garbageValue = "-190919972"
	)
	static WorldMapSectionType[] method4884() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2}; // L: 17
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050835652"
	)
	static void method4888() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				LoginScreenAnimation.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				LoginScreenAnimation.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "57610498"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		GrandExchangeOfferTotalQuantityComparator.method7091(var0, var1, var2, var3, var4, var5, -1, false); // L: 10343
	} // L: 10344

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1233384886"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class113.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 12702
		var0.packetBuffer.writeByte(0); // L: 12703
		Client.packetWriter.addNode(var0); // L: 12704
	} // L: 12705

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	static void method4889() {
		if (MidiPcmStream.field3456 != null) { // L: 12924
			Client.field783 = Client.cycle; // L: 12925
			MidiPcmStream.field3456.method7163(); // L: 12926

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12927
				if (Client.players[var0] != null) { // L: 12928
					MidiPcmStream.field3456.method7159(class187.baseX * 64 + (Client.players[var0].x >> 7), class101.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12929
				}
			}
		}

	} // L: 12933
}
