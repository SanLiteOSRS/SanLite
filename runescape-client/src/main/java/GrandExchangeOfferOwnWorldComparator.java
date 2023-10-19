import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field515;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = 44170089
	)
	static int field516;
	@ObfuscatedName("ac")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13048

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;S)I",
		garbageValue = "255"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13051
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13052
				if (Client.worldId == var1.world) { // L: 13053
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13054
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13056
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13060
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13064
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2097816691"
	)
	public static int method1242(int var0) {
		return SecureRandomFuture.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 82
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "29"
	)
	static Object method1241(int var0) {
		return ItemContainer.method2290((class517)SequenceDefinition.findEnumerated(class517.method9047(), var0)); // L: 5357
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-1344994052"
	)
	static final void method1237(PendingSpawn var0) {
		long var1 = 0L; // L: 8667
		int var3 = -1; // L: 8668
		int var4 = 0; // L: 8669
		int var5 = 0; // L: 8670
		if (var0.type == 0) { // L: 8671
			var1 = class10.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8672
			var1 = class10.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8673
			var1 = class10.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8674
			var1 = class10.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8675
			int var6 = class10.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8676
			var3 = SecureRandomFuture.Entity_unpackID(var1); // L: 8677
			var4 = var6 & 31; // L: 8678
			var5 = var6 >> 6 & 3; // L: 8679
		}

		var0.objectId = var3; // L: 8681
		var0.field1176 = var4; // L: 8682
		var0.field1178 = var5; // L: 8683
	} // L: 8684

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
	)
	static final void method1240() {
		PacketBufferNode var0 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 12379
		Client.packetWriter.addNode(var0); // L: 12380
		Interpreter.field883 = true; // L: 12381

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12382
			if (var1.type == 0 || var1.type == 3) { // L: 12383
				ArchiveDisk.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12385
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget); // L: 12386
			Client.meslayerContinueWidget = null; // L: 12387
		}

		Interpreter.field883 = false; // L: 12389
	} // L: 12390
}
