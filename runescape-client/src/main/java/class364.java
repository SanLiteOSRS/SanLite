import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class364 implements class363 {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("f")
	Map field4079;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	final class390 field4080;

	@ObfuscatedSignature(
		descriptor = "(Lon;)V"
	)
	public class364(class390 var1) {
		this.field4080 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1883866066"
	)
	public int vmethod6399(int var1) {
		if (this.field4079 != null) {
			class391 var2 = (class391)this.field4079.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4227;
			}
		}

		return (Integer)this.field4080.vmethod6893(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1983435032"
	)
	public void vmethod6398(int var1, Object var2) {
		if (this.field4079 == null) {
			this.field4079 = new HashMap();
			this.field4079.put(var1, new class391(var1, var2));
		} else {
			class391 var3 = (class391)this.field4079.get(var1);
			if (var3 == null) {
				this.field4079.put(var1, new class391(var1, var2));
			} else {
				var3.field4227 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4079 == null ? Collections.emptyList().iterator() : this.field4079.values().iterator();
	}
}
