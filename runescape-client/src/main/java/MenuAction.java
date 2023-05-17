import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("Ignored_cached")
	static class473 Ignored_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 68640743
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1427372077
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 532700261
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1480765569
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 680599237
	)
	int field875;
	@ObfuscatedName("ab")
	String field880;
	@ObfuscatedName("aq")
	String field882;

	MenuAction() {
	} // L: 12312

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[BLqk;B)V",
		garbageValue = "73"
	)
	static void method2041(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		class124.method3057(); // L: 26
	} // L: 27

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)V",
		garbageValue = "1515081265"
	)
	public static void method2040(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 67
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 68
	} // L: 69

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1939733213"
	)
	public static void method2043(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 28
	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2123095492"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 154
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "116"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		SceneTilePaint.method4912(var0, var1, var2, var3, var4, var5, -1, false); // L: 9643
	} // L: 9644
}
