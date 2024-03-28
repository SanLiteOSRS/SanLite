import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -426885431
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 949053627
	)
	@Export("z")
	int z;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -579758287
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -75311981
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1838078397
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1231846989
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1221231993
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1563803153
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1819773647
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -474154295
	)
	int field2948;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -419984023
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -790211439261957893L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 698081091
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1740520249"
	)
	public static void method5220() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 420
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 421
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 422
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 423
	} // L: 424

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1985186064"
	)
	static Object method5218(int var0) {
		return class33.method457((class522)KitDefinition.findEnumerated(class522.method9125(), var0)); // L: 5403
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1930840269"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class143.friendsChatManager != null) { // L: 12739
			PacketBufferNode var1 = class425.getPacketBufferNode(ClientPacket.field3260, Client.packetWriter.isaacCipher); // L: 12740
			var1.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var0)); // L: 12741
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12742
			Client.packetWriter.addNode(var1); // L: 12743
		}
	} // L: 12744
}
