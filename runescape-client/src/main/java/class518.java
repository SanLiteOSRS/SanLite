import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
final class class518 implements class517 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luq;S)V",
		garbageValue = "25989"
	)
	public void vmethod9339(Object var1, Buffer var2) {
		this.method9293((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-1139404213"
	)
	public Object vmethod9338(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Luq;B)V",
		garbageValue = "10"
	)
	void method9293(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1184828130"
	)
	static void method9298() {
		if (Client.field625 && VarpDefinition.localPlayer != null) { // L: 12925
			int var0 = VarpDefinition.localPlayer.pathX[0]; // L: 12926
			int var1 = VarpDefinition.localPlayer.pathY[0]; // L: 12927
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12928
				return;
			}

			Friend.oculusOrbFocalPointX = VarpDefinition.localPlayer.x; // L: 12929
			int var2 = class272.getTileHeight(VarpDefinition.localPlayer.x, VarpDefinition.localPlayer.y, class473.Client_plane) - Client.camFollowHeight; // L: 12930
			if (var2 < GrandExchangeOfferWorldComparator.field4449) { // L: 12931
				GrandExchangeOfferWorldComparator.field4449 = var2;
			}

			class59.oculusOrbFocalPointY = VarpDefinition.localPlayer.y; // L: 12932
			Client.field625 = false; // L: 12933
		}

	} // L: 12935
}
