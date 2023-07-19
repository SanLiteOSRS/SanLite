import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class class506 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	class502[] field5045;
	@ObfuscatedName("ay")
	List field5044;

	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V"
	)
	public class506(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method8947(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lnr;II)V"
	)
	public class506(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method8947(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "832549499"
	)
	void method8947(Buffer var1) {
		int var2 = var1.method9079(); // L: 31
		this.field5045 = new class502[var2]; // L: 32
		this.field5044 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5045[var3] = (class502)class93.findEnumerated(class502.method8908(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9079(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5045[var3].method8895(var1); // L: 39
				int var7 = var1.method9079(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9079(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5044.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "2114359212"
	)
	public List method8948(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5044.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
