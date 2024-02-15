import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class109 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1391;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1392;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1393;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1394;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1395;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1396;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1397;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1404;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1399;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1401;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1402;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1400;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1403;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1398;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1405;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1406;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 170127347
	)
	int field1407;

	static {
		field1391 = new class109(0); // L: 2046
		field1392 = new class109(1); // L: 2047
		field1393 = new class109(2); // L: 2048
		field1394 = new class109(3); // L: 2049
		field1395 = new class109(4); // L: 2050
		field1396 = new class109(5); // L: 2051
		field1397 = new class109(6); // L: 2052
		field1404 = new class109(7); // L: 2053
		field1399 = new class109(8); // L: 2054
		field1401 = new class109(9); // L: 2055
		field1402 = new class109(10); // L: 2056
		field1400 = new class109(11); // L: 2057
		field1403 = new class109(12); // L: 2058
		field1398 = new class109(13); // L: 2059
		field1405 = new class109(14); // L: 2060
		field1406 = new class109(15); // L: 2061
	}

	class109(int var1) {
		this.field1407 = var1; // L: 2065
	} // L: 2066

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static void method2796() {
		Login.Login_username = Login.Login_username.trim(); // L: 1155
		if (Login.Login_username.length() == 0) { // L: 1156
			class114.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 1157
		} else if (Login.Login_password.length() == 0) { // L: 1160
			class114.setLoginResponseString("", "Please enter your password.", ""); // L: 1161
		} else {
			class114.setLoginResponseString("", "Connecting to server...", ""); // L: 1164
			ScriptEvent.method2361(false); // L: 1165
			Interpreter.method2106(20); // L: 1166
		}
	} // L: 1158 1162 1167
}
