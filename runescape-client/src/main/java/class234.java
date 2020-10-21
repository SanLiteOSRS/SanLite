import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class234 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IS)Lia;",
		garbageValue = "-3621"
	)
	public static FloorUnderlayDefinition method4260(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "4"
	)
	public static void method4261() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "969326800"
	)
	static String method4262() {
		String var0 = "";

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') {
			var2 = (Message)var1.next();
		}

		return var0;
	}
}
