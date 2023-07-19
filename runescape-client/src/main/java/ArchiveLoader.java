import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1458089811
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -482166407
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lng;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1490818884"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6714(var1) || this.archive.method6718(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "1175994020"
	)
	public static void method2282(AbstractArchive var0) {
		class504.field5039 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-40"
	)
	public static int method2283(int var0) {
		return var0 >>> 4 & class508.field5054; // L: 22
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1524363783"
	)
	static int method2280(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5112
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5113
			WorldMapSectionType.method5509(var3); // L: 5114
			return 1; // L: 5115
		} else {
			return 2; // L: 5117
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method2281() {
		Client.packetWriter.addNode(class217.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher)); // L: 12786
		Client.oculusOrbState = 0; // L: 12787
	} // L: 12788
}
