import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class1 implements Callable {
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	final Buffer field1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laq;Lsy;Lab;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field0 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field0.vmethod12(this.field1); // L: 54
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-564139226"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 86
		if (var1 == null) { // L: 87
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 88 89
		}
	}
}
