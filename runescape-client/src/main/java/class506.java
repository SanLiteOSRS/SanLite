import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class506 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ltb;"
	)
	class502[] field5047;
	@ObfuscatedName("ac")
	List field5050;

	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V"
	)
	public class506(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method8949(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V"
	)
	public class506(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method8949(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "1051210616"
	)
	void method8949(Buffer var1) {
		int var2 = var1.method9080(); // L: 31
		this.field5047 = new class502[var2]; // L: 32
		this.field5050 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5047[var3] = (class502)class25.findEnumerated(class502.method8922(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9080(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5047[var3].method8917(var1); // L: 39
				int var7 = var1.method9080(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9080(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5050.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "113"
	)
	public List method8950(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5050.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
