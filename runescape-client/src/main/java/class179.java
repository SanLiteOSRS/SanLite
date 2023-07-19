import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class179 extends class182 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1541416803
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[Lme;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1081638615
	)
	int field1877;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class171 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;I)V"
	)
	class179(class171 var1, String var2, int var3) {
		super(var1, var2); // L: 376
		this.this$0 = var1; // L: 375
		this.field1877 = var3; // L: 377
	} // L: 378

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-403708913"
	)
	public int vmethod3636() {
		return 0; // L: 381
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	public int vmethod3633() {
		return this.field1877; // L: 386
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1367341166"
	)
	static void method3613() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1524273777"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4578
	}
}
