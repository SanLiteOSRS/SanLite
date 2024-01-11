import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("tc")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("tb")
	static boolean field1832;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -324322137
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "20"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1962603931"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43
}
