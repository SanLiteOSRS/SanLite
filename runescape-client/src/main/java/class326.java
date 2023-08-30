import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mw")
public class class326 {
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -466560567
	)
	static int field3559;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field3557;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	SpritePixels field3556;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;)V"
	)
	class326(String var1, UrlRequester var2) {
		try {
			this.field3557 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3557 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class326(UrlRequest var1) {
		this.field3557 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-688482237"
	)
	SpritePixels method6057() {
		if (this.field3556 == null && this.field3557 != null && this.field3557.isDone()) { // L: 28
			if (this.field3557.getResponse() != null) { // L: 29
				this.field3556 = WorldMapData_1.method5347(this.field3557.getResponse()); // L: 30
			}

			this.field3557 = null; // L: 32
		}

		return this.field3556; // L: 34
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-856388391"
	)
	public static void method6058(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1268604308"
	)
	static int method6059(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1822
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1823
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemId; // L: 1824
			return 1; // L: 1825
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1827
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1828
			if (var3.itemId != -1) { // L: 1829
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 1830
			}

			return 1; // L: 1831
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1833
			int var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1834
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1835
			if (var4 != null) { // L: 1836
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 1837
			}

			return 1; // L: 1838
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1840
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1841
			return 1; // L: 1842
		} else if (var0 == 2707) { // L: 1844
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1845
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method6474() ? 1 : 0; // L: 1846
			return 1; // L: 1847
		} else if (var0 == 2708) { // L: 1849
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1850
			return WorldMapDecoration.method5480(var3); // L: 1851
		} else if (var0 == 2709) { // L: 1853
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1854
			return class390.method7221(var3); // L: 1855
		} else {
			return 2; // L: 1857
		}
	}
}
