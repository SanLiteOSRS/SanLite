import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -2050427863
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("w")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("v")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 6884574486836599899L
	)
	long field1717;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -630136301
	)
	int field1718;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 768383915
	)
	int field1720;
	@ObfuscatedName("n")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("l")
	public byte field1722;
	@ObfuscatedName("k")
	public byte field1740;
	@ObfuscatedName("c")
	public byte field1736;
	@ObfuscatedName("r")
	public byte field1725;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 609780291
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("m")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("t")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("h")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("p")
	int[] field1730;
	@ObfuscatedName("o")
	public int[] field1731;
	@ObfuscatedName("u")
	public boolean[] field1732;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1492537853
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 977974859
	)
	public int field1734;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2066313809
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("d")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("e")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("g")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1718 = 0; // L: 14
		this.name = null; // L: 15
		this.field1720 = 0; // L: 16
		this.currentOwner = -1;
		this.field1734 = -1;
		this.method3258(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-139593993"
	)
	void method3279(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field1730 != null) {
			System.arraycopy(this.field1730, 0, this.field1730 = new int[var1], 0, this.memberCount);
		} else {
			this.field1730 = new int[var1];
		}

		if (this.field1731 != null) {
			System.arraycopy(this.field1731, 0, this.field1731 = new int[var1], 0, this.memberCount);
		} else {
			this.field1731 = new int[var1];
		}

		if (this.field1732 != null) {
			System.arraycopy(this.field1732, 0, this.field1732 = new boolean[var1], 0, this.memberCount); // L: 61
		} else {
			this.field1732 = new boolean[var1];
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1554618972"
	)
	void method3239(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1098460015"
	)
	public int method3281(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-28"
	)
	public int method3227(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1730[var1] & var4) >>> var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1228062939"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-5"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 103
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.sortedMembers;
			GameObject.method4867(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "41"
	)
	void method3230(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 115
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 117
				this.method3279(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 118
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 119
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 120
				this.currentOwner = this.memberCount; // L: 121
				this.memberRanks[this.memberCount] = 126; // L: 122
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 125
			}

			this.field1730[this.memberCount] = 0; // L: 127
			this.field1731[this.memberCount] = var4; // L: 128
			this.field1732[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2088665402"
	)
	void method3231(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 135
			--this.memberCount; // L: 136
			this.sortedMembers = null; // L: 137
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null; // L: 139
				this.memberNames = null; // L: 140
				this.memberRanks = null; // L: 141
				this.field1730 = null; // L: 142
				this.field1731 = null; // L: 143
				this.field1732 = null; // L: 144
				this.currentOwner = -1; // L: 145
				this.field1734 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 149
				System.arraycopy(this.field1730, var1 + 1, this.field1730, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1731, var1 + 1, this.field1731, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1732, var1 + 1, this.field1732, var1, this.memberCount - var1); // L: 152
				if (this.memberHashes != null) { // L: 153
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 154
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 155
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 157

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "934486709"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1734 = -1; // L: 162
		} else {
			this.currentOwner = -1; // L: 165
			this.field1734 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.memberRanks[0]; // L: 168

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 169
				if (this.memberRanks[var3] > var2) { // L: 170
					if (var2 == 125) {
						this.field1734 = var1; // L: 171
					}

					var1 = var3; // L: 172
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1734 == -1 && this.memberRanks[var3] == 125) { // L: 175
					this.field1734 = var3; // L: 176
				}
			}

			this.currentOwner = var1; // L: 179
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-1469829407"
	)
	void method3233(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 185
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method3239(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 188
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 189
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 190
		}
	} // L: 191

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1220938857"
	)
	void method3224(int var1) {
		--this.bannedMemberCount; // L: 194
		if (this.bannedMemberCount == 0) { // L: 195
			this.bannedMemberHashes = null; // L: 196
			this.bannedMemberNames = null; // L: 197
		} else {
			if (this.bannedMemberHashes != null) { // L: 200
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 201
			}
		}

	} // L: 203

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "1312856804"
	)
	int method3261(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1734 == -1 || this.memberRanks[this.field1734] < 125)) { // L: 207
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 208
			} else {
				this.memberRanks[var1] = var2; // L: 209
				this.updateOwner(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2036782663"
	)
	boolean method3265(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1734 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "7"
	)
	int method3237(int var1, boolean var2) {
		if (this.field1732[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1732[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1265657645"
	)
	int method3244(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1730[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1730[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1901194150"
	)
	boolean method3234(int var1, int var2) {
		if (this.parameters != null) { // L: 243
			Node var3 = this.parameters.get((long)var1); // L: 244
			if (var3 != null) { // L: 245
				if (var3 instanceof IntegerNode) { // L: 246
					IntegerNode var4 = (IntegerNode)var3; // L: 247
					if (var2 == var4.integer) { // L: 248
						return false;
					}

					var4.integer = var2; // L: 249
					return true; // L: 250
				}

				var3.remove(); // L: 252
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 255
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 256
		return true; // L: 257
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-49732436"
	)
	boolean method3240(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 261
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 262
		int var7 = var6 ^ var5; // L: 263
		var2 <<= var3; // L: 264
		var2 &= var7; // L: 265
		if (this.parameters != null) { // L: 266
			Node var8 = this.parameters.get((long)var1); // L: 267
			if (var8 != null) { // L: 268
				if (var8 instanceof IntegerNode) { // L: 269
					IntegerNode var9 = (IntegerNode)var8; // L: 270
					if ((var9.integer & var7) == var2) { // L: 271
						return false;
					}

					var9.integer &= ~var7; // L: 272
					var9.integer |= var2; // L: 273
					return true; // L: 274
				}

				var8.remove(); // L: 276
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 279
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 280
		return true; // L: 281
	}

	@ObfuscatedName("o")
	boolean method3241(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class437) { // L: 288
					class437 var5 = (class437)var4; // L: 289
					if (var2 == var5.field4706) { // L: 290
						return false;
					}

					var5.field4706 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class437(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-1440392993"
	)
	boolean method3242(int var1, String var2) {
		if (var2 == null) { // L: 303
			var2 = "";
		} else if (var2.length() > 80) { // L: 304
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 305
			Node var3 = this.parameters.get((long)var1); // L: 306
			if (var3 != null) { // L: 307
				if (var3 instanceof ObjectNode) { // L: 308
					ObjectNode var4 = (ObjectNode)var3; // L: 309
					if (var4.obj instanceof String) { // L: 310
						if (var2.equals(var4.obj)) { // L: 311
							return false;
						}

						var4.remove(); // L: 312
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 313
						return true; // L: 314
					}
				}

				var3.remove(); // L: 317
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 320
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 321
		return true; // L: 322
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "466080590"
	)
	void method3258(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 326
		if (var2 >= 1 && var2 <= 6) { // L: 327
			int var3 = var1.readUnsignedByte(); // L: 328
			if ((var3 & 1) != 0) { // L: 329
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 330
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 331
				this.memberHashes = null; // L: 332
				this.bannedMemberHashes = null; // L: 333
			}

			if (!this.useNames) { // L: 335
				this.memberNames = null; // L: 336
				this.bannedMemberNames = null; // L: 337
			}

			this.field1718 = var1.readInt(); // L: 339
			this.field1720 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1720 != 0) { // L: 341
				this.field1720 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1722 = var1.readByte(); // L: 349
			this.field1740 = var1.readByte(); // L: 350
			this.field1736 = var1.readByte(); // L: 351
			this.field1725 = var1.readByte(); // L: 352
			int var4;
			if (this.memberCount > 0) { // L: 353
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 354
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 355
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 356
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1730 == null || this.field1730.length < this.memberCount) { // L: 357
					this.field1730 = new int[this.memberCount];
				}

				if (this.field1731 == null || this.field1731.length < this.memberCount) { // L: 358
					this.field1731 = new int[this.memberCount];
				}

				if (this.field1732 == null || this.field1732.length < this.memberCount) { // L: 359
					this.field1732 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 360
					if (this.useHashes) { // L: 361
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 362
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 363
					if (var2 >= 2) { // L: 364
						this.field1730[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1731[var4] = var1.readUnsignedShort();
					} else {
						this.field1731[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1732[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1732[var4] = false; // L: 368
					}
				}

				this.updateOwner(); // L: 370
			}

			if (this.bannedMemberCount > 0) { // L: 372
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 373
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 374
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 375
					if (this.useHashes) { // L: 376
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 377
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 380
				var4 = var1.readUnsignedShort(); // L: 381
				if (var4 > 0) { // L: 382
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class4.method21(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class437(var10), (long)var6); // L: 394
						} else if (var7 == 2) { // L: 396
							String var8 = var1.readStringCp1252NullTerminated(); // L: 397
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 398
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 403

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILgt;Lgv;I)Z",
		garbageValue = "-451842817"
	)
	public static final boolean method3235(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class209.directions[var6][var7] = 99; // L: 25
		class209.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class209.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class209.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var11 != var18) { // L: 34
			var4 = class209.bufferX[var11]; // L: 35
			var5 = class209.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				class209.field2371 = var4; // L: 43
				class209.field2372 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class209.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class209.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class209.bufferX[var18] = var4 - 1; // L: 49
				class209.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class209.directions[var16 - 1][var17] = 2; // L: 52
				class209.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class209.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class209.bufferX[var18] = var4 + 1; // L: 56
				class209.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class209.directions[var16 + 1][var17] = 8; // L: 59
				class209.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class209.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class209.bufferX[var18] = var4; // L: 63
				class209.bufferY[var18] = var5 - 1; // L: 64
				var18 = var18 + 1 & 4095; // L: 65
				class209.directions[var16][var17 - 1] = 1; // L: 66
				class209.distances[var16][var17 - 1] = var15; // L: 67
			}

			if (var17 < 127 && class209.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 69
				class209.bufferX[var18] = var4; // L: 70
				class209.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class209.directions[var16][var17 + 1] = 4; // L: 73
				class209.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class209.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class209.bufferX[var18] = var4 - 1; // L: 77
				class209.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class209.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class209.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class209.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class209.bufferX[var18] = var4 + 1; // L: 84
				class209.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class209.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class209.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class209.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class209.bufferX[var18] = var4 - 1; // L: 91
				class209.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class209.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class209.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class209.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class209.bufferX[var18] = var4 + 1; // L: 98
				class209.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class209.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class209.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		class209.field2371 = var4; // L: 105
		class209.field2372 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-18"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 13134
			PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 13136
			var1.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0)); // L: 13137
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 13138
			Client.packetWriter.addNode(var1); // L: 13139
		}
	} // L: 13140

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	static boolean method3293() {
		return PacketWriter.clientPreferences.method2503() >= Client.field501; // L: 13375
	}
}
