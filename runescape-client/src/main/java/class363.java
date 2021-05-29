import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class363 implements class362 {
	@ObfuscatedName("br")
	static String field4079;
	@ObfuscatedName("v")
	Map field4082;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	final class389 field4078;

	@ObfuscatedSignature(
		descriptor = "(Lne;)V"
	)
	public class363(class389 var1) {
		this.field4078 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-350566290"
	)
	public int vmethod6362(int var1) {
		if (this.field4082 != null) {
			class390 var2 = (class390)this.field4082.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4218;
			}
		}

		return (Integer)this.field4078.vmethod6837(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1681668792"
	)
	public void vmethod6364(int var1, Object var2) {
		if (this.field4082 == null) {
			this.field4082 = new HashMap();
			this.field4082.put(var1, new class390(var1, var2));
		} else {
			class390 var3 = (class390)this.field4082.get(var1);
			if (var3 == null) {
				this.field4082.put(var1, new class390(var1, var2));
			} else {
				var3.field4218 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4082 == null ? Collections.emptyList().iterator() : this.field4082.values().iterator();
	}
}
