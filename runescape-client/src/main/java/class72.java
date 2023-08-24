import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class72 {
	@ObfuscatedName("ac")
	static final BigInteger field910;
	@ObfuscatedName("ai")
	static final BigInteger field912;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 401845471
	)
	static int field906;

	static {
		field910 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field912 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1604625566"
	)
	static void method2078() {
		Client.compass = null; // L: 1295
		class167.redHintArrowSprite = null; // L: 1296
		class299.mapSceneSprites = null; // L: 1297
		class178.field1894 = null; // L: 1298
		class502.field5029 = null; // L: 1299
		ArchiveLoader.field1063 = null; // L: 1300
		Message.field508 = null; // L: 1301
		class152.field1717 = null; // L: 1302
		FloorOverlayDefinition.field2289 = null; // L: 1303
		GrandExchangeOfferOwnWorldComparator.scrollBarSprites = null; // L: 1304
		class451.field4755 = null; // L: 1305
	} // L: 1306
}
