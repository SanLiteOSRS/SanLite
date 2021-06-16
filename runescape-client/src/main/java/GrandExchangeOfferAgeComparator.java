import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;B)I",
		garbageValue = "1"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "1304582630"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				Projectile.method2075();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			class27.method364(ModeWhere.archive8, var0.properties);
		}

		Client.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		UserComparator7.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class96.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		UserComparator2.currentPort = UserComparator7.worldPort;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-56"
	)
	static final void method5203(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method49()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = InterfaceParent.getPacketBufferNode(ClientPacket.field2675, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + class44.stringCp1252NullTerminatedByteSize(var3.name));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.name);
				var4.addNode(var5);
			}
		}
	}
}
