/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlin

public class Array<reified T>(public val size: Int, init: (Int) -> T) : Cloneable {
    public fun get(index: Int): T
    public fun set(index: Int, value: T): Unit

    public fun iterator(): Iterator<T>

    public val indices: IntRange

    public override fun clone(): Array<T>
}
