import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class134 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 730256935
	)
	int field1581;
	@ObfuscatedName("q")
	byte field1586;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1773818537
	)
	int field1582;
	@ObfuscatedName("u")
	String field1584;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1581 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1897546377"
	)
	void vmethod3146(Buffer var1) {
		this.field1581 = var1.readUnsignedShort(); // L: 109
		this.field1586 = var1.readByte(); // L: 110
		this.field1582 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1584 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-406744366"
	)
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1581); // L: 117
		var2.rank = this.field1586; // L: 118
		var2.world = this.field1582; // L: 119
		var2.username = new Username(this.field1584); // L: 120
	} // L: 121

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "487596361"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class28.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class300.baseX * 64; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - Message.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		FriendSystem.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1295[var1] != null) { // L: 50
			var2.read(Players.field1295[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1293[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1293[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqq;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 58
			var2 = (RunException)var0; // L: 59
			var2.message = var2.message + ' ' + var1; // L: 60
		} else {
			var2 = new RunException(var0, var1); // L: 62
		}

		return var2; // L: 63
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1422099031"
	)
	public static boolean method2939(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field138[var0] : false; // L: 254 255
	}
}
