import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class521 extends DualNode {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Ltr;"
	)
	class517[] field5085;
	@ObfuscatedName("ao")
	List field5083;

	@ObfuscatedSignature(
		descriptor = "(Lom;I)V"
	)
	public class521(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method9088(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lom;II)V"
	)
	public class521(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method9088(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "677675313"
	)
	void method9088(Buffer var1) {
		int var2 = var1.method9225(); // L: 31
		this.field5085 = new class517[var2]; // L: 32
		this.field5083 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5085[var3] = (class517)SequenceDefinition.findEnumerated(class517.method9047(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9225(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5085[var3].method9032(var1); // L: 39
				int var7 = var1.method9225(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9225(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5083.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "17353223"
	)
	public List method9089(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5083.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
