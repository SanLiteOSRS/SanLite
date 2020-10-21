import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive14")
	static Archive archive14;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "-47"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BZI)Ljava/lang/Object;",
		garbageValue = "1848040279"
	)
	public static Object method4069(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lcf;B)V",
		garbageValue = "2"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != SoundCache.ItemDefinition_inMembersWorld) {
				class200.method3803();
				SoundCache.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			AbstractArchive.method4386(GrandExchangeOffer.archive8, var0.properties);
		}

		UserComparator6.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		Coord.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		Coord.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class41.port3 = Coord.port1;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "407362763"
	)
	static void method4087(int var0) {
		GrandExchangeOffer.tempMenuAction = new MenuAction();
		GrandExchangeOffer.tempMenuAction.param0 = Client.menuArguments1[var0];
		GrandExchangeOffer.tempMenuAction.param1 = Client.menuArguments2[var0];
		GrandExchangeOffer.tempMenuAction.opcode = Client.menuOpcodes[var0];
		GrandExchangeOffer.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		GrandExchangeOffer.tempMenuAction.action = Client.menuActions[var0];
	}
}
