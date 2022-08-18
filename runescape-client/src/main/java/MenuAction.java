import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 380314879
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -291428413
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -922743889
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1337817419
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -749946813
	)
	int field879;
	@ObfuscatedName("w")
	String field880;
	@ObfuscatedName("z")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12507

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1691149719"
	)
	static void method1933() {
		UserComparator6.method2701(24); // L: 2006
		HealthBarUpdate.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2007
	} // L: 2008
}
